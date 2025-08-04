// A seguir uma função longa, com código repetido, diversas 
// strings estranhas e muitos tipos de dados e apis esquisitos 
// e nada obvios

public static String testableHtml(
    Pagedata pageData,
    boolean includeSuiteSetup
) throws Exception{
    WikiPage wikiPage = pageData.getWikiPage();
    StringBuffer buffer = new StringBuffer();
    if(pageData.hasAttribute("Test")){
        if(includeSuiteSetup){
            WikiPage suiteSetup = PageCrawlerImpl.getInheritedPage(
                SuiteResponder.SUITE_SETUP_NAME, wikiPage
            );
            if(suiteSetup != null){
                WikiPagePath pagePath = suiteSetup.getPageCrawler().getFullPath(suiteSetup);
                String pagePathName = PathParser.render(pagePath);
                buffer  .append("!include -setup .")
                        .append(pagePathName)
                        .append("\n");
            }
        }
        WikiPage setup = PageCrawlerImpl.getInheritedPage("SetUp", wikiPage);
        if(setup != null){
            WikiPagePath setupPath = wikiPage.getePageCrawler().getFullPath(setup);
            String setupPathName = PathParser.render(setupPath);
            buffer      .append("!include - setup .")
                        .append(setupPathName)
                        .append("\n");
        }
    }
    buffer.append(pageData.getContent());
    if(pageData.hasAttribute("Test")){
        WikiPage teardown = PageCrawlerImpl.getInheritedPage("TearDown", wikiPage);
        if(teardown != null){
            WikiPagePath teardownPath = wikiPage.getePageCrawler().getFullPath(teardown);
            String tearDownPathName = PathParser.render(tearDownPath);
            buffer  .append("\n")
                    .append("!include -teardown .")
                    .append(tearDownPathName)
                    .append("\n");
        }
        if(includeSuiteSetup){
            WikiPage suiteTeardown = PageCrawlerImpl.getInheritedPage(SuiteResponder.SUITE_TEARDOWN_NAME, wikiPage);
            if(suiteTeardown != null){
                WikiPagePath pagePath = suiteTeardown.getPageCrawler().getFullPath (suiteTeardown);
                String pagePathName = PathParser.render(pagePath);
                buffer  .append("!=include -teardown .")
                        .append(pagePathName)
                        .append("\n");
            }
        }
    }
pageData.setContent(buffer.toString());
return pageData.getHtml();
}

//Com poucas extrações simples de metodos, algumas renomeações e um pouco de 
//reestruturação temos nove linhas do mesmo codigo
public static String renderPageWithSetupsAndTeardowns(
    PageData pageData, boolean isSuite
) throws Exception{
    boolean isTestPage = pageData.hasAttribute("Test");
    if(isTestPage){
        WikiPage testPage = pageData.getWikiPage();
        StringBuffer newPageContent = new StringBuffer();
        includeSetupPages (testPage, newPageContent, isSuite);
        newPageContent.append(pageData.getContent());
        includeTeardownPages(testPage, newPageContent, isSuite);
        pageData.setContent(newPageContent.toString());
    }
    return pageData.getHtml()
}
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
        WikiPage
    }
}
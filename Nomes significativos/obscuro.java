private void printGuessStatistics(char candidate, int count){
    String number, verb, pluralModifier;
    if(count == 0){
        number = "no";
        verb = "Existem";
        pluralModifier = "s";
    }
    else if(count == 1){
        number = "1";
        verb = "Existe";
        pluralModifier = "";
    }
    else{
        number = Interger.toString(count);
        verb = "Existem";
        pluralModifier = "s";
    }
    String guessMenssage = String.format(
        "There %s %s %s%s", verb, number, candidate, pluralModifier
    );
    print(guessMenssage);
}

//uma maneira mais simples de deixar esse codigo mais clean seria dividir em funções visto que a mesma variavel é repetida varias vezes

public class GuessStatisticsMenssage{
    private String number;
    private String verb;
    private String pluralModifier;

    public String make (char candidate, int count){
        createPluralDependentMessageParts(count);
        return String.format(
            "There %s %s %s%s", verb, number, candidate, pluralModifier
        );
    }
    private void createPluralDependentMessageParts(int count){
        if(count == 0){
            thereAreNoLetters();
        }
        else if(count == 1){
            thereIsOneLetter();
        }
        else{
            thereAreManyLetters(count);
        }
    }
    private void thereAreManyLetters(int count){
        number = Interger.toString(count);
        verb = "Existem";
        pluralModifier = "s";
    }
    private void thereIsOneLetter(){
        number = "1";
        verb = "Existe";
        pluralModifier = "";
    }
    private void thereAreNoLetters(){
        number = "no";
        verb = "Existem";
        pluralModifier = "s";
    }
}
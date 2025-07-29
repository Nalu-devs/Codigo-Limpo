/*Os nomes podem ser dados em portugues se seguir a mesma logica, nos programas desse git usarei 
o ingles por motivos de compreensão maior de outras pessoas, porem colocarei tradução caso precisem*/


//Se um nome requer um comentario ele não revela seu proposito
int d;// tempo decorrido em dias
//d não significa nada não traz seu verdadeiro proposito

int elapsedTimeInDays; // tempo decorrido em dias
int daysSinceCreation; // dias desde a criação
int daysSinceModification; // dias desde a modificação
int fileAgeInDays; // arquivo idade em dias

//Um codigo com variaveis irreconheciveis e fora de contexto não fazem sentido:
public List<int[]> getThem(){
    List<int[]> list1 = new ArrayList<int[]>();
    for (int[] x : theList){
        if(x[0] == 4){
            list1.add(x);
        }
    }
    return list1;
}
/*Esse codigo se mostra sem sentido quando não conseguimos responder perguntas simples como:
qual a importancia de um item na posição zero?
o que esta em theList?
como eu usaria a lista retornada?*/

//Agora se vemos um codigo com variaveis logicas temos
public List<int[]> getFlaggedCells(){
    List<int[]> flaggedCells = new ArrayList<int[]>();
    for (int[] cell : gameBoard){
        if(cell[STATUS_VALUE] == FLAGGED){
            flaggedCells.add(cell);
        }
    }
    return flaggedCells;
}
/*getFlaggedCells = obter celulas sinalizadas
flaggedCells = células sinalizadas
cell = celula
gameBoard = jogo de tabuleiro*/
//Com essa simples atualização de nomes não fica dificil entender o que esta acontencendo

//Outra coisa ruim é colocar numeros depois de uma variavel sem sentido
public static void copyChars(char a1[], char a2[]){
    for(int i = 0; i<a1.length; i++){
        a2[i] = a1[i];
    }
}

/*Passar dicas falsas ou que confundam quem vai ler seu codigo, nomes como hr, aix, sco seriam
nomes ruins para variaveis assim como accountList o ideal seria accountGroup ou bunchOfAcconts*/

int xyzControllerForEfficientHandlingOfStrings;
int xyzControllerForEfficientStorageOfStrings;

//nomes muito semelhantes e longos não são nada eficientes e se tornam confusos
/*Tambem devesmos tomar cuidado com algumas letras como o "l" minusculo e o "o" 
maiusculo por se parcer muito com 1 e 0*/

int a = l;
if(O == l)
    a = O1;
else
    l = 01;

//confuso e desnecessário
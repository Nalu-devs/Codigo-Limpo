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
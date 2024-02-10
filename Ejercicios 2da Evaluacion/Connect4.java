/*Task
The game consists of a grid (7 columns and 6 rows) and two players that take turns to drop their discs. The pieces fall straight down, occupying the next available

space within the column. The objective of the game is to be the first to form a horizontal, vertical, or diagonal line of four of one's own discs.

Your task is to create a Class called Connect4 that has a method called play which takes one argument for the column where the player is going to place their disc.

Rules
If a player successfully has 4 discs horizontally, vertically or diagonally then you should return "Player n wins!” where n is the current player either 1 or 2.

If a player attempts to place a disc in a column that is full then you should return ”Column full!” and the next move must be taken by the same player.

If the game has been won by a player, any following moves should return ”Game has finished!”.

Any other move should return ”Player n has a turn” where n is the current player either 1 or 2.
 
Player 1 starts the game every time and alternates with player 2.

The columns are numbered 0-6 left to right.*/



//Solution

public class Connect4 {

    //Atributos Definen el estado del objeto
    private final int FILAS = 6;
    private final int COLS = 7;
    private final char[][] tablero;
    private char quienJuega;
    private boolean finJuego;

    //metodos
    //constructor
    public Connect4() { //constructor por defecto (o sin parametros)
        tablero = new char[FILAS][COLS];//creamos el tablero
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLS; j++) {
                tablero[i][j] = ' ';
            }
        }
        quienJuega = '1';
        finJuego = false;

    }

    public String play(int columna) {
        if (finJuego) {
            return "Game has finished!";
        }
        //validar el parametro
        if (columna < 0 || columna > COLS) {
            return "Invalid move!";
        }
        int fila = FILAS - 1;//SIempre empiezo la jugada en la fila 5.
        while (fila >= 0 && tablero[fila][columna] != ' ') {
            fila--;
        }
        if (fila < 0) {//verificando que sea posible hacer la jugada

            return "Column full!";
        }
        tablero[fila][columna] = quienJuega; //marco la jugada con el nombre del jugador

        char qj = quienJuega;//almacena el jugador actual
        //verificar el estado del juego
        if (ganaJuego(fila, columna, quienJuega)) {
            finJuego = true;
            quienJuega = '1'; //siempre empieza el jugador 1
            return "Player " + qj + " wins!";
        }
        cambiarTurno();//se cambia el turno para la proxima jugada
        return "Player " + qj + " has a turn";
    }

    private boolean ganaJuego(int fila, int col, char jugador) {
        //Revisamos la linea vertical (hacia el sur)
        if (revisarLinea(fila, col, 1, 0, jugador)) {
            return true;
        }
        for(int desplazamiento = 0; desplazamiento <4;desplazamiento++){
            //me voy desplazando 4 lugares
            //linea horizontal
            if(revisarLinea(fila, col + 3 - desplazamiento, 0, -1, jugador)){
                //direccion W 
                return true;
            }
                //diagonal secundaria
            if(revisarLinea(fila - 3 + desplazamiento, col + 3 - desplazamiento, 1, -1, jugador)){
                //direccion SW
                
                return true;
            }
            //diagonal primaria
            if(revisarLinea(fila + 3 - desplazamiento, col + 3 - desplazamiento, -1, -1, jugador)){
                //direccion SE
                //direccion NW
                return true;
            }
        }
        return false;
    }

    private void cambiarTurno() {
        /*if(quienJuega == '1'){
            quienJuega = '2';
        }else{
            quienJuega = '1';
        }*/
        quienJuega = (quienJuega == '1') ? '2' : '1';

    }

    private boolean revisarLinea(int fila, int col, int fDir, int cDir, char jugador) {
        for (int i = 0; i < 4; i++) {
            int f = fila + (fDir * i); //posicion actual que voy a revisar 
            int c = col + (cDir * i);
            if (f < 0 || f > FILAS - 1) {
                return false; //posicion fuera del tablero
            }
            if (c < 0 || c > COLS - 1) {
                return false;//posicion fuera del tablero
            }
            if (jugador != tablero[f][c]) {
                return false;
            }
        }
        return true;

    }
}

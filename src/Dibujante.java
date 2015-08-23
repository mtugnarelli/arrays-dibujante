
public class Dibujante {
    
    /**
     * pre : papel es un arreglo regular de tamaño mínimo 3x3.
     *
     * post: pinta sobre en el array papel una cruz utilizando colorPincel.
     *       El grosor del trazo es como mínimo un tercio del espacio disponible.
     */
    public void pintarCruz(Color[][] papel, Color colorPincel) {

        int anchoPapel = papel.length; 
        int anchoFranja = anchoPapel / 3;
        int altoPapel = papel[anchoFranja].length;
        int altoFranja = altoPapel / 3;
        
        if (altoPapel < 3 || anchoPapel < 3) {
            
            throw new Error("Tamaño del papel incorrecto, por lo menos debe ser de 3x3");
        }
        
        this.pintarRectangulo(papel, anchoFranja, anchoPapel - anchoFranja, 
                                     0, altoPapel,
                                     colorPincel);
        
        this.pintarRectangulo(papel, 0, anchoFranja, 
                                     altoFranja, altoPapel - altoFranja, 
                                     colorPincel);
        
        this.pintarRectangulo(papel, anchoPapel - anchoFranja, anchoPapel, 
                                     altoFranja, altoPapel - altoFranja,
                                     colorPincel);
        
    }
    
    private void pintarRectangulo(Color[][] papel, 
                                  int desdeX, int hastaX, 
                                  int desdeY, int hastaY, 
                                  Color colorPincel) {
        
        for (int x = desdeX; x < hastaX; x++) {
            
            for (int y = desdeY; y < hastaY; y++) {
            
                papel[x][y] = colorPincel;
            }
        }
    }
}

























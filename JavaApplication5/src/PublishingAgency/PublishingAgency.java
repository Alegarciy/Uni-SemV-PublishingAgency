/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PublishingAgency;

import PublishingAgency.DocumentStates.Draft;

/**
 *
 * @author alega
 */
public class PublishingAgency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Document document = new Document();
        document.write("En un lugar de la Mancha, de cuyo nombre no quiero acordarme, no ha mucho tiempo que \n vivía un hidalgo de los de lanza en astillero, adarga antigua, rocín flaco y galgo corredor. Una \n olla de algo más vaca que carnero, salpicón las más noches, duelos y quebrantos los \n sábados, lentejas los viernes, algún palomino de añadidura los domingos, consumían las tres \n partes de su hacienda. El resto della concluían sayo de velarte, calzas de velludo para las \n fiestas con sus pantuflos de lo mismo, los días de entre semana se honraba con su vellori de \n lo más fino. Tenía en su casa una ama que pasaba de los cuarenta, y una sobrina que no \n llegaba a los veinte, y un mozo de campo y plaza, que así ensillaba el rocín como tomaba la \n podadera. Frisaba la edad de nuestro hidalgo con los cincuenta años, era de complexión \n recia, seco de carnes, enjuto de rostro; gran madrugador y amigo de la caza. Quieren decir \n que tenía el sobrenombre de Quijada o Quesada (que en esto hay alguna diferencia \n en los autores que deste caso escriben), aunque por conjeturas verosímiles se deja entender que \n se llama Quijana; pero esto importa poco a nuestro cuento; basta que en la narración dél no se salga \n un punto de la verdad \n \n");
        document.changeState(new Draft(document));
        
        //Draft state
        document.print();
        //Moderation state
        document.publish();
        document.print();
        //Published state
        document.publish();
        document.print();
        //End of publishing;
        document.publish();
        
    }
    
}

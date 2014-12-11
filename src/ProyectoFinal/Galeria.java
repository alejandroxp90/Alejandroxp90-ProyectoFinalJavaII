package ProyectoFinal;

import java.util.ArrayList;

/**
 *
 * Alejandro Juarez
 */
public class Galeria {
    ArrayList<Imagensita> imagenes;

    public Galeria() {
        imagenes=new ArrayList<Imagensita>();
        
        Imagensita i1=new Imagensita();
        i1.setUrl("\\Proyectos de Java\\ProyectoFinalJavaII\\src\\Imagenes\\Alien.png");
        i1.setTitulo("Los Primeros Aliens en la Tierra");
        i1.setDescripcion("Se denomina extraterrestre a todo ser vivo originario de algún "
                +"sitio del Cosmos ajeno a la Tierra o a su atmósfera. Aunque la palabra "
                +"extraterrestre se emplea para todo aquello que es ajeno a la Tierra, la "
                +"mayor parte de las personas sólo la tiene en cuenta al referirse a los "
                +"seres provenientes del espacio exterior. Por lo general, la vida extraterrestre "
                +"inteligente se asocia al fenómeno ovni.");
        
        
        Imagensita i2=new Imagensita();
        i2.setUrl("\\Proyectos de Java\\ProyectoFinalJavaII\\src\\Imagenes\\Angel.png");
        i2.setTitulo("Angeles de la Muerte");
        i2.setDescripcion("Los Ángeles Caídos o nefilim son todos aquellos ángeles expulsados "
                +"del cielo como castigo por desobedecer o rebelarse contra Dios. Las Sagradas "
                +"Escrituras nos dicen también que un ángel caído tendrá que vagar por la tierra"
                +" hasta el día del juicio final cuando serán desterrados y enviados al infierno. "
                +"El ángel caído más conocido es Lucifer.");
        
         
        Imagensita i3=new Imagensita();
        i3.setUrl("\\Proyectos de Java\\ProyectoFinalJavaII\\src\\Imagenes\\Angel2.png");
        i3.setTitulo("Divinidades Terrenales");
        i3.setDescripcion("Me he caido del cielo, Para esta noche estar contigo. He atravesado el umbral"
                +" Del tiempo para amarte, Para poseerte, para transformarte. Te veo cuando extiendes Tus "
                +" alas cubiertas Con plumajes de ansiedad Me juegas bromas Inmorales,  Que me desprenden "
                +"De este mundo de Realidad. Vienes desnudo, Como lo hace la verdad, Y te presentas en el "
                +"todo, Pues tienes la ubicuidad. Mil una vez he tratado, de ocultarte, Y hasta he cre?do "
                +"ignorarte, Pero lentamente Te acumulas en mis poros, Hasta verte salir Explosivamente. "
                +"Vienes desnudo Como lo hace la verdad Y te presentas en el todo, Pues tienes la ubicuidad. ");
        
        Imagensita i4=new Imagensita();
        i4.setUrl("\\Proyectos de Java\\ProyectoFinalJavaII\\src\\Imagenes\\Angel3.png");
        i4.setTitulo("Angeles Celestiales de Amor");
        i4.setDescripcion("Aunque como representantes y mensajeros del Amor Divino todos los ángeles son"+
                " ángeles del amor, cuando una persona se refiere a los ángeles con esta frase está "
                +"buscando información sobre ángeles de un tipo de amor específico: el amor romántico. "
                +" Para muchos, es el amor que parece inalcanzable. ");
        
         Imagensita i5=new Imagensita();
        i5.setUrl("\\Proyectos de Java\\ProyectoFinalJavaII\\src\\Imagenes\\Gato.png");
        i5.setTitulo("Gatos Místicos");
        i5.setDescripcion("El gato: Un animal mágico. Los gatos han sido considerados, desde hace miles "
                +"de años, como animales misteriosos, mágicos y a su alrededor han surgido supersticiones "
                +"tanto positivas como negativas. Sin embargo, qué hay de cierto sobre todo lo que se habla del gato?");
        
        
          
         
        
        //Agregar estas imagenss al ArrayList
         
        imagenes.add(i1);
        imagenes.add(i2);
        imagenes.add(i3);
        imagenes.add(i4);
        imagenes.add(i5);
         
        
    
        
        
    }

    public ArrayList<Imagensita> leerTodas() {
        return imagenes;
    }

    public void setImagenes(ArrayList<Imagensita> imagenes) {
        this.imagenes = imagenes;
    }
    
    
    
    
}

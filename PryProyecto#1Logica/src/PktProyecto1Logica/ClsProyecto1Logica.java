package PktProyecto1Logica;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class ClsProyecto1Logica {
static char a1,b1,c1,d1;
static boolean a,b,c,d;

public void TablaVerdad(String preposicion)
{
	JTextArea areaTextoSalida = new JTextArea();
	  ClsProyecto1Logica ObjLlamar=new ClsProyecto1Logica();
	
	  switch (preposicion) {
/////////////////////////////////////////////////////////////////////1
	case ("p->q"),("~pvq") :
		     a=true;b=false;c=true;d=true;
	
			areaTextoSalida.setText("p\tq\t"+preposicion
		            +"\n_______________________________\n");
			areaTextoSalida.append("V\tV\t"+ObjLlamar.operacionesA(a)+"\n");
			areaTextoSalida.append("V\tF\t"+ObjLlamar.operacionesB(b)+"\n");
			areaTextoSalida.append("F\tV\t"+ObjLlamar.operacionesB(c)+"\n");
			areaTextoSalida.append("F\tF\t"+ObjLlamar.operacionesB(d)+"\n");
		JOptionPane.showMessageDialog(null, areaTextoSalida, "TABLA DE VERDAD", JOptionPane.INFORMATION_MESSAGE);
		break;
/////////////////////////////////////////////////////////////////////2
	case ("~p->~q"),("pv~q") :
	     a=true;b=true;c=false;d=true;
		areaTextoSalida.setText("p\tq\t"+preposicion
	            +"\n_______________________________\n");
		areaTextoSalida.append("V\tV\t"+ObjLlamar.operacionesA(a)+"\n");
		areaTextoSalida.append("V\tF\t"+ObjLlamar.operacionesB(b)+"\n");
		areaTextoSalida.append("F\tV\t"+ObjLlamar.operacionesB(c)+"\n");
		areaTextoSalida.append("F\tF\t"+ObjLlamar.operacionesB(d)+"\n");
	JOptionPane.showMessageDialog(null, areaTextoSalida, "TABLA DE VERDAD", JOptionPane.INFORMATION_MESSAGE);
	break;
/////////////////////////////////////////////////////////////////////3
	case ("p->~q"),("~pv~q") :
	     a=false;b=true;c=true;d=true;
		areaTextoSalida.setText("p\tq\t"+preposicion
	            +"\n_______________________________\n");
		areaTextoSalida.append("V\tV\t"+ObjLlamar.operacionesA(a)+"\n");
		areaTextoSalida.append("V\tF\t"+ObjLlamar.operacionesB(b)+"\n");
		areaTextoSalida.append("F\tV\t"+ObjLlamar.operacionesB(c)+"\n");
		areaTextoSalida.append("F\tF\t"+ObjLlamar.operacionesB(d)+"\n");
	JOptionPane.showMessageDialog(null, areaTextoSalida, "TABLA DE VERDAD", JOptionPane.INFORMATION_MESSAGE);
	break;
/////////////////////////////////////////////////////////////////////4
	case ("~p->q"),("pvq") :
	     a=true;b=true;c=true;d=false;
		areaTextoSalida.setText("p\tq\t"+preposicion
	            +"\n_______________________________\n");
	
		areaTextoSalida.append("V\tV\t"+ObjLlamar.operacionesA(a)+"\n");
		areaTextoSalida.append("V\tF\t"+ObjLlamar.operacionesB(b)+"\n");
		areaTextoSalida.append("F\tV\t"+ObjLlamar.operacionesB(c)+"\n");
		areaTextoSalida.append("F\tF\t"+ObjLlamar.operacionesB(d)+"\n");
	JOptionPane.showMessageDialog(null, areaTextoSalida, "TABLA DE VERDAD", JOptionPane.INFORMATION_MESSAGE);
	break;
/////////////////////////////////////////////////////////////////////5
	case ("p<->q"),("~p<->~q") :
	     a=true;b=false;c=false;d=true;
		areaTextoSalida.setText("p\tq\t"+preposicion
	            +"\n_______________________________\n");

		areaTextoSalida.append("V\tV\t"+ObjLlamar.operacionesA(a)+"\n");
		areaTextoSalida.append("V\tF\t"+ObjLlamar.operacionesB(b)+"\n");
		areaTextoSalida.append("F\tV\t"+ObjLlamar.operacionesB(c)+"\n");
		areaTextoSalida.append("F\tF\t"+ObjLlamar.operacionesB(d)+"\n");
	JOptionPane.showMessageDialog(null, areaTextoSalida, "TABLA DE VERDAD", JOptionPane.INFORMATION_MESSAGE);
	break;
/////////////////////////////////////////////////////////////////////6
	case ("~p<->q"),("p<->~q"),("p+q"):
	     a=false;b=true;c=true;d=false;
		areaTextoSalida.setText("p\tq\t"+preposicion
	            +"\n_______________________________\n");

		areaTextoSalida.append("V\tV\t"+ObjLlamar.operacionesA(a)+"\n");
		areaTextoSalida.append("V\tF\t"+ObjLlamar.operacionesB(b)+"\n");
		areaTextoSalida.append("F\tV\t"+ObjLlamar.operacionesB(c)+"\n");
		areaTextoSalida.append("F\tF\t"+ObjLlamar.operacionesB(d)+"\n");
	JOptionPane.showMessageDialog(null, areaTextoSalida, "TABLA DE VERDAD", JOptionPane.INFORMATION_MESSAGE);
	break;
/////////////////////////////////////////////////////////////////////7
case ("p"),("q") :
a=true;b=false;
	areaTextoSalida.setText(preposicion
			+"\n_______________________________\n");
	areaTextoSalida.append(ObjLlamar.operacionesA(a)+"\n");
	areaTextoSalida.append(ObjLlamar.operacionesB(b)+"\n");
	JOptionPane.showMessageDialog(null, areaTextoSalida, "TABLA DE VERDAD", JOptionPane.INFORMATION_MESSAGE);

break;
/////////////////////////////////////////////////////////////////////8
case ("~p"),("~q") :
	a=false;b=true;
	if (preposicion=="p") {
		areaTextoSalida.setText("q\t"+preposicion
				+"\n_______________________________\n");
		areaTextoSalida.append("V\t"+ObjLlamar.operacionesA(a)+"\n");
		areaTextoSalida.append("F\t"+ObjLlamar.operacionesB(b)+"\n");
		JOptionPane.showMessageDialog(null, areaTextoSalida, "TABLA DE VERDAD", JOptionPane.INFORMATION_MESSAGE);
	}else{
		areaTextoSalida.setText("p\t"+preposicion
				+"\n_______________________________\n");
		areaTextoSalida.append("V\t"+ObjLlamar.operacionesA(a)+"\n");
		areaTextoSalida.append("F\t"+ObjLlamar.operacionesB(b)+"\n");
		JOptionPane.showMessageDialog(null, areaTextoSalida, "TABLA DE VERDAD", JOptionPane.INFORMATION_MESSAGE);
	}break;
/////////////////////////////////////////////////////////////////////9
case ("p^q") :
    a=true;b=false;c=false;d=false;
	areaTextoSalida.setText("p\tq\t"+preposicion
           +"\n_______________________________\n");

	areaTextoSalida.append("V\tV\t"+ObjLlamar.operacionesA(a)+"\n");
	areaTextoSalida.append("V\tF\t"+ObjLlamar.operacionesB(b)+"\n");
	areaTextoSalida.append("F\tV\t"+ObjLlamar.operacionesB(c)+"\n");
	areaTextoSalida.append("F\tF\t"+ObjLlamar.operacionesB(d)+"\n");
JOptionPane.showMessageDialog(null, areaTextoSalida, "TABLA DE VERDAD", JOptionPane.INFORMATION_MESSAGE);
break;
/////////////////////////////////////////////////////////////////////10
case ("~p^q") :
a=false;b=false;c=true;d=false;
areaTextoSalida.setText("p\tq\t"+preposicion
+"\n_______________________________\n");

areaTextoSalida.append("V\tV\t"+ObjLlamar.operacionesA(a)+"\n");
areaTextoSalida.append("V\tF\t"+ObjLlamar.operacionesB(b)+"\n");
areaTextoSalida.append("F\tV\t"+ObjLlamar.operacionesB(c)+"\n");
areaTextoSalida.append("F\tF\t"+ObjLlamar.operacionesB(d)+"\n");
JOptionPane.showMessageDialog(null, areaTextoSalida, "TABLA DE VERDAD", JOptionPane.INFORMATION_MESSAGE);
break;
/////////////////////////////////////////////////////////////////////11
case ("p^~q") :
a=false;b=true;c=false;d=false;
areaTextoSalida.setText("p\tq\t"+preposicion
+"\n_______________________________\n");

areaTextoSalida.append("V\tV\t"+ObjLlamar.operacionesA(a)+"\n");
areaTextoSalida.append("V\tF\t"+ObjLlamar.operacionesB(b)+"\n");
areaTextoSalida.append("F\tV\t"+ObjLlamar.operacionesB(c)+"\n");
areaTextoSalida.append("F\tF\t"+ObjLlamar.operacionesB(d)+"\n");
JOptionPane.showMessageDialog(null, areaTextoSalida, "TABLA DE VERDAD", JOptionPane.INFORMATION_MESSAGE);
break;
/////////////////////////////////////////////////////////////////////12
case ("~p^~q") :
a=false;b=false;c=false;d=true;
areaTextoSalida.setText("p\tq\t"+preposicion
+"\n_______________________________\n");

areaTextoSalida.append("V\tV\t"+ObjLlamar.operacionesA(a)+"\n");
areaTextoSalida.append("V\tF\t"+ObjLlamar.operacionesB(b)+"\n");
areaTextoSalida.append("F\tV\t"+ObjLlamar.operacionesB(c)+"\n");
areaTextoSalida.append("F\tF\t"+ObjLlamar.operacionesB(d)+"\n");
JOptionPane.showMessageDialog(null, areaTextoSalida, "TABLA DE VERDAD", JOptionPane.INFORMATION_MESSAGE);
/////////////////////////////////////////////////////////////////////FINALIZAR
case "0": JOptionPane.showMessageDialog(null,"Ha FINALIZADO LA EJECUCIÓN","FINALIZACIÓN",1);
         System.exit(0);
          break;
/////////////////////////////////////////////////////////////////////DEFAULT
default:  JOptionPane.showMessageDialog(null, "Ingrese un Caracter permitido"		  		
                + "   ^ (AND\n"
		  		+ "   + (OR exclusiva)\n"
		  		+ "   v  (o)\n"
		  		+ "   ~  (negación)\n"
		  		+ "   -> (entonces)\n"
		  		+ "  <-> (si solo si)\n");
		        break;
	}
}
//Operaciones
public char operacionesA(boolean a)                                {
	char a1;
	if (a==(true)) {
		a1='V';
	}else{
		a1='F';
	}
	return a1;
}
public char operacionesB(boolean b){
	char b1;
	if (b==(true)) {
		b1='V';
	}else{
		b1='F';
	};
	return b1;
}
public char operacionesC(boolean c){
	char c1;
	if (c==(true)) {
		c1='V';
	}else{
		c1='F';
	};
	return c1;
}
public char operacionesD(boolean d){
	char d1;
	if (d==(true)) {
		d1='V';
	}else{
		d1='F';
	};
	return d1;
}
//MAIN
	public static void main(String[] args) {
		  ClsProyecto1Logica ObjtMtd=new ClsProyecto1Logica();
		  JOptionPane.showMessageDialog(null, ""
		  		+ "                           Antes de empezar \n Estos son los caracteres que permite esta calculadora:\n"
		  		+ "   ^ (AND\n"
		  		+ "   + (OR exclusiva)\n"
		  		+ "   v  (o)\n"
		  		+ "   ~  (negación)\n"
		  		+ "   -> (entonces)\n"
		  		+ "  <-> (si solo si)\n");
		String preposicion=JOptionPane.showInputDialog(null,"Ingrese la operacion que quiera realizar\n");
		  while(preposicion != "0")
		  {
			  ObjtMtd.TablaVerdad(preposicion);
				preposicion=JOptionPane.showInputDialog(null,"Si desa continuar ingrese valores p y q para calcular\nSI NO COLOQUE 0 PARA FINALIZAR");
				}
		  }
	}





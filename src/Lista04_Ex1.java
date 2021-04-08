import javax.swing.JOptionPane;
public class Lista04_Ex1 {
   public static void main(String args[]) {
      // variaveis e objetos
      Lista04 obj = new Lista04();
      int[]   vB, vS, vI, vQ;
      int     tam, i;
      String  msg = "";
      // solicitar tamanho dos vetores
      tam = Integer.parseInt( JOptionPane.showInputDialog("Qual o tamanho dos vetores?") );
      // instancias vetores
      vB = new int[tam];
      vS = new int[tam];
      vI = new int[tam];
      vQ = new int[tam];
      // gerar valores randomicos nos vetores
      for (i = 0; i < vB.length; i++) {
         vB[i] = (int)(Math.random() * tam);
         vS[i] = vB[i];
         vI[i] = vB[i];
         vQ[i] = vB[i];
      }
      // mostra vetores sem ordenar
      msg = "VETORES SEM ORDENAR\nVetor Bubble:\n"    + obj.showVetor(vB) +
            "\nVetor Selection:\n" + obj.showVetor(vS) +
            "\nVetor Insertion:\n" + obj.showVetor(vI) +
            "\nVetor Quick:\n"     + obj.showVetor(vQ);
      // faz ordenacao
      obj.bubbleDESC(vB);
      obj.selectionDESC(vS);
      obj.insertionDESC(vI);
      obj.quickDESC(vQ);
      // mostra vetores sem ordenar
      msg += "\n\nVETORES ORDENADOS\nVetor Bubble:\n"    + obj.showVetor(vB) +
             "\nVetor Selection:\n" + obj.showVetor(vS) +
             "\nVetor Insertion:\n" + obj.showVetor(vI) +
             "\nVetor Quick:\n"     + obj.showVetor(vQ);
      // exibe mensagem final
      JOptionPane.showMessageDialog(null, msg);
      // fim
      System.exit(0);
   }
}
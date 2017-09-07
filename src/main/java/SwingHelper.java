import javax.swing.*;

public class SwingHelper {

   public JLabel createLabel(int x, int y, int width, int height){
       JLabel label = new JLabel();
       label.setBounds(x,y,width,height);
       return label;
   }

   public JButton createButton(int x, int y, int width, int height, String text){
       JButton button = new JButton();
       button.setBounds(x,y,width,height);
       button.setText(text);
       return button;
   }

}

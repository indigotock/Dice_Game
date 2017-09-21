import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class Start {

    public static void main(String[] args){
        final List<Die> dice = new ArrayList<Die>();
        SwingHelper helper = new SwingHelper();
        JFrame f =new JFrame("Dice Game");//creating instance of JFrame
        f.setSize(4000,1000);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        final JLabel d1 = helper.createLabel(10,10,2000,200);
        Font font = d1.getFont();
        d1.setFont(new Font(font.getName(), Font.PLAIN, 80));
        JButton addDie = helper.createButton(30,200,100,50,"Add Die");
        addDie.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (dice.size() < 10){
                    dice.add(new Die(1,20));
                }
            }
        });

        JButton removeDie = helper.createButton(260,200,150,50,"Remove Die");
        removeDie.addActionListener(e -> dice.remove(dice.size()-1));
        JButton rollDice = helper.createButton(150,200,100,50,"Roll Dice");

        rollDice.addActionListener(e -> {
            StringBuilder builder = new StringBuilder();
            for (Die d : dice){
                int value = d.rollDie();
                builder.append(value).append("-");
            }
            d1.setText(builder.toString());
        });

        f.add(addDie);//adding button in JFrame
        f.add(rollDice);//adding button in JFrame
        f.add(removeDie);
        f.add(d1);
        f.setSize(400,500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible


    }

}

import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;


public class MainFrame extends JFrame implements ActionListener {
    

    //Параметры окна и размера карт
    static final int WIDTH=1200;
    static final int HEIGHT=800;
    static final int CARD_SIZE=150;


    //Изображения карточек
    static ImageIcon rune1 = new ImageIcon("res/Руна1.png");
    static ImageIcon rune2 = new ImageIcon("res/Руна2.png");
    static ImageIcon rune3 = new ImageIcon("res/Руна3.png");
    static ImageIcon rune4 = new ImageIcon("res/Руна4.png");
    static ImageIcon rune5 = new ImageIcon("res/Руна5.png");
    static ImageIcon rune6 = new ImageIcon("res/Руна6.png");
    static ImageIcon rune7 = new ImageIcon("res/Руна7.png");
    static ImageIcon rune8 = new ImageIcon("res/Руна8.png");
    static ImageIcon rune9 = new ImageIcon("res/Руна9.png");
    static ImageIcon rune10 = new ImageIcon("res/Руна10.png");
    static ImageIcon rune11 = new ImageIcon("res/Руна11.png");
    static ImageIcon rune12 = new ImageIcon("res/Руна12.png");

    //Изображение кнопки
    static ImageIcon buttonIcon = new ImageIcon("res/Кнопка.png");


    //Карточки-объекты
    static Card card1= new Card(rune1, 1,1);
    static Card card2= new Card(rune1, 2,1);
    static Card card3= new Card(rune2, 3,2);
    static Card card4= new Card(rune2, 4,2);
    static Card card5= new Card(rune3, 5,3);
    static Card card6= new Card(rune3, 6,3);
    static Card card7= new Card(rune4, 7,4);
    static Card card8= new Card(rune4, 8,4);
    static Card card9= new Card(rune5, 9,5);
    static Card card10= new Card(rune5, 10,5);
    static Card card11= new Card(rune6, 11,6);
    static Card card12= new Card(rune6, 12,6);
    static Card card13= new Card(rune7, 13,7);
    static Card card14= new Card(rune7, 14,7);
    static Card card15= new Card(rune8, 15,8);
    static Card card16= new Card(rune8, 16,8);
    static Card card17= new Card(rune9, 17,9);
    static Card card18= new Card(rune9, 18,9);
    static Card card19= new Card(rune10, 19,10);
    static Card card20= new Card(rune10, 20,10);
    static Card card21= new Card(rune11, 21,11);
    static Card card22= new Card(rune11, 22,11);
    static Card card23= new Card(rune12, 23,12);
    static Card card24= new Card(rune12, 24,12);




    //Первый ряд кнопок
    int y1=20;
    int x1=60;
    int x2=240;
    int x3=430;
    int x4=600;
    int x5=780;
    int x6=960;
    ButtonCard buttonCard1 = new ButtonCard(MainFrame.card1,x1,y1);
    ButtonCard buttonCard2 = new ButtonCard(MainFrame.card1,x2,y1);
    ButtonCard buttonCard3 = new ButtonCard(MainFrame.card1,x3,y1);
    ButtonCard buttonCard4 = new ButtonCard(MainFrame.card1,x4,y1);
    ButtonCard buttonCard5 = new ButtonCard(MainFrame.card1,x5,y1);
    ButtonCard buttonCard6 = new ButtonCard(MainFrame.card1,x6,y1);

    //Второй
    int y2=220;
    ButtonCard buttonCard7 = new ButtonCard(MainFrame.card1,x1,y2);
    ButtonCard buttonCard8 = new ButtonCard(MainFrame.card1,x2,y2);
    ButtonCard buttonCard9 = new ButtonCard(MainFrame.card1,x3,y2);
    ButtonCard buttonCard10 = new ButtonCard(MainFrame.card1,x4,y2);
    ButtonCard buttonCard11 = new ButtonCard(MainFrame.card1,x5,y2);
    ButtonCard buttonCard12 = new ButtonCard(MainFrame.card1,x6,y2);
    //Третий 420
    int y3=410;
    ButtonCard buttonCard13 = new ButtonCard(MainFrame.card1,x1,y3);
    ButtonCard buttonCard14 = new ButtonCard(MainFrame.card1,x2,y3);
    ButtonCard buttonCard15 = new ButtonCard(MainFrame.card1,x3,y3);
    ButtonCard buttonCard16 = new ButtonCard(MainFrame.card1,x4,y3);
    ButtonCard buttonCard17 = new ButtonCard(MainFrame.card1,x5,y3);
    ButtonCard buttonCard18 = new ButtonCard(MainFrame.card1,x6,y3);
    //Четвёртый 620
    int y4=610;
    ButtonCard buttonCard19 = new ButtonCard(MainFrame.card1,x1,y4);
    ButtonCard buttonCard20 = new ButtonCard(MainFrame.card1,x2,y4);
    ButtonCard buttonCard21 = new ButtonCard(MainFrame.card1,x3,y4);
    ButtonCard buttonCard22 = new ButtonCard(MainFrame.card1,x4,y4);
    ButtonCard buttonCard23 = new ButtonCard(MainFrame.card1,x5,y4);
    ButtonCard buttonCard24 = new ButtonCard(MainFrame.card1,x6,y4);
    ArrayList<ButtonCard> buttonArrays= new ArrayList<>();


    //Координаты индикатора маны
    ManaBar manaBarRight=new ManaBar(1136,0);
    ManaBar manaBarLeft=new ManaBar(0,0);


    //Объекты фона, игрового стола и экранов меню
    Background background=new Background();
    Table table=new Table();
    Menu menu=new Menu();
    AboutGame aboutGame= new AboutGame();
    DifScreen difScreen=new DifScreen();
    WinScreen winScreen= new WinScreen();
    LoseScreen loseScreen=new LoseScreen();

    GameData gameData= new GameData();



    JLayeredPane jLayeredPane=new JLayeredPane();

    //Объекты кнопок
    JButton startGame;
    JButton credits;
    JButton exit;
    JButton back;
    JButton back1;
    JButton backWin;
    JButton backLose;
    JButton easy;
    JButton middle;
    JButton hard;

    //Координаты кнопки Старт
    int x=272;
    int y=255;


    //Конструктор окна
    MainFrame(){
        setTitle("Пасьянс");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(WIDTH,HEIGHT);
        setLocationRelativeTo(null);
        jLayeredPane.setBounds(0,0,MainFrame.WIDTH,MainFrame.HEIGHT);
        add(jLayeredPane);
        setVisible(true);
        setLayout(null);
        setResizable(false);
        jLayeredPane.add(background, JLayeredPane.DEFAULT_LAYER);
        jLayeredPane.add(table, JLayeredPane.PALETTE_LAYER);
        jLayeredPane.add(menu, JLayeredPane.PALETTE_LAYER);
        jLayeredPane.add(aboutGame, JLayeredPane.PALETTE_LAYER);
        jLayeredPane.add(difScreen, JLayeredPane.PALETTE_LAYER);
        jLayeredPane.add(winScreen, JLayeredPane.PALETTE_LAYER);
        jLayeredPane.add(loseScreen, JLayeredPane.PALETTE_LAYER);

        startGame=new JButton();
        startGame.setBounds(x,y,150,86);
        startGame.addActionListener(this);
        startGame.setText("Играть");
        startGame.setFocusable(false);
        startGame.setVisible(true);
        startGame.setIcon(buttonIcon);
        startGame.setHorizontalTextPosition(JButton.CENTER);
        startGame.setVerticalTextPosition(JButton.CENTER);
        startGame.setFont(new Font("Amazon",Font.BOLD,25));

        credits=new JButton();
        credits.setBounds(x,y+85,150,86);
        credits.addActionListener(this);
        credits.setText("Об игре");
        credits.setFocusable(false);
        credits.setVisible(true);
        credits.setIcon(buttonIcon);
        credits.setHorizontalTextPosition(JButton.CENTER);
        credits.setVerticalTextPosition(JButton.CENTER);
        credits.setFont(new Font("Amazon",Font.BOLD,25));

        exit=new JButton();
        exit.setBounds(x,y+170,150,86);
        exit.addActionListener(this);
        exit.setText("Выход");
        exit.setFocusable(false);
        exit.setVisible(true);
        exit.setIcon(buttonIcon);
        exit.setHorizontalTextPosition(JButton.CENTER);
        exit.setVerticalTextPosition(JButton.CENTER);
        exit.setFont(new Font("Amazon",Font.BOLD,25));

        back=new JButton();
        back.setBounds(x,y+200,150,86);
        back.addActionListener(this);
        back.setText("Назад");
        back.setFocusable(false);
        back.setVisible(true);
        back.setIcon(buttonIcon);
        back.setHorizontalTextPosition(JButton.CENTER);
        back.setVerticalTextPosition(JButton.CENTER);
        back.setFont(new Font("Amazon",Font.BOLD,25));

        back1=new JButton();
        back1.setBounds(x,y+260,150,86);
        back1.addActionListener(this);
        back1.setText("Назад");
        back1.setFocusable(false);
        back1.setVisible(true);
        back1.setIcon(buttonIcon);
        back1.setHorizontalTextPosition(JButton.CENTER);
        back1.setVerticalTextPosition(JButton.CENTER);
        back1.setFont(new Font("Amazon",Font.BOLD,25));

        backWin=new JButton();
        backWin.setBounds(x,y+260,150,86);
        backWin.addActionListener(this);
        backWin.setText("Назад");
        backWin.setFocusable(false);
        backWin.setVisible(true);
        backWin.setIcon(buttonIcon);
        backWin.setHorizontalTextPosition(JButton.CENTER);
        backWin.setVerticalTextPosition(JButton.CENTER);
        backWin.setFont(new Font("Amazon",Font.BOLD,25));

        backLose=new JButton();
        backLose.setBounds(x,y+260,150,86);
        backLose.addActionListener(this);
        backLose.setText("Назад");
        backLose.setFocusable(false);
        backLose.setVisible(true);
        backLose.setIcon(buttonIcon);
        backLose.setHorizontalTextPosition(JButton.CENTER);
        backLose.setVerticalTextPosition(JButton.CENTER);
        backLose.setFont(new Font("Amazon",Font.BOLD,25));

        easy=new JButton();
        easy.setBounds(x,y,150,86);
        easy.addActionListener(this);
        easy.setText("Ученик");
        easy.setFocusable(false);
        easy.setVisible(true);
        easy.setIcon(buttonIcon);
        easy.setHorizontalTextPosition(JButton.CENTER);
        easy.setVerticalTextPosition(JButton.CENTER);
        easy.setFont(new Font("Amazon",Font.BOLD,25));

        middle=new JButton();
        middle.setBounds(x,y+85,150,86);
        middle.addActionListener(this);
        middle.setText("Адепт");
        middle.setFocusable(false);
        middle.setVisible(true);
        middle.setIcon(buttonIcon);
        middle.setHorizontalTextPosition(JButton.CENTER);
        middle.setVerticalTextPosition(JButton.CENTER);
        middle.setFont(new Font("Amazon",Font.BOLD,25));

        hard=new JButton();
        hard.setBounds(x,y+170,150,86);
        hard.addActionListener(this);
        hard.setText("Магистр");
        hard.setFocusable(false);
        hard.setVisible(true);
        hard.setIcon(buttonIcon);
        hard.setHorizontalTextPosition(JButton.CENTER);
        hard.setVerticalTextPosition(JButton.CENTER);
        hard.setFont(new Font("Amazon",Font.BOLD,25));


        menu.add(startGame);
        menu.add(credits);
        menu.add(exit);
        aboutGame.add(back);
        difScreen.add(easy);
        difScreen.add(middle);
        difScreen.add(hard);
        difScreen.add(back1);
        winScreen.add(backWin);
        loseScreen.add(backLose);
        table.add(manaBarLeft);
        table.add(manaBarRight);
        table.add(buttonCard1);
        buttonArrays.add(buttonCard1);
        buttonCard1.addActionListener(this);
        table.add(buttonCard2);
        buttonArrays.add(buttonCard2);
        buttonCard2.addActionListener(this);
        table.add(buttonCard3);
        buttonArrays.add(buttonCard3);
        buttonCard3.addActionListener(this);
        table.add(buttonCard4);
        buttonArrays.add(buttonCard4);
        buttonCard4.addActionListener(this);
        table.add(buttonCard5);
        buttonArrays.add(buttonCard5);
        buttonCard5.addActionListener(this);
        table.add(buttonCard6);
        buttonArrays.add(buttonCard6);
        buttonCard6.addActionListener(this);
        table.add(buttonCard7);
        buttonArrays.add(buttonCard7);
        buttonCard7.addActionListener(this);
        table.add(buttonCard8);
        buttonArrays.add(buttonCard8);
        buttonCard8.addActionListener(this);
        table.add(buttonCard9);
        buttonArrays.add(buttonCard9);
        buttonCard9.addActionListener(this);
        table.add(buttonCard10);
        buttonArrays.add(buttonCard10);
        buttonCard10.addActionListener(this);
        table.add(buttonCard11);
        buttonArrays.add(buttonCard11);
        buttonCard11.addActionListener(this);
        table.add(buttonCard12);
        buttonArrays.add(buttonCard12);
        buttonCard12.addActionListener(this);
        table.add(buttonCard13);
        buttonArrays.add(buttonCard13);
        buttonCard13.addActionListener(this);
        table.add(buttonCard14);
        buttonArrays.add(buttonCard14);
        buttonCard14.addActionListener(this);
        table.add(buttonCard15);
        buttonArrays.add(buttonCard15);
        buttonCard15.addActionListener(this);
        table.add(buttonCard16);
        buttonArrays.add(buttonCard16);
        buttonCard16.addActionListener(this);
        table.add(buttonCard17);
        buttonArrays.add(buttonCard17);
        buttonCard17.addActionListener(this);
        table.add(buttonCard18);
        buttonArrays.add(buttonCard18);
        buttonCard18.addActionListener(this);
        table.add(buttonCard19);
        buttonArrays.add(buttonCard19);
        buttonCard19.addActionListener(this);
        table.add(buttonCard20);
        buttonArrays.add(buttonCard20);
        buttonCard20.addActionListener(this);
        table.add(buttonCard21);
        buttonArrays.add(buttonCard21);
        buttonCard21.addActionListener(this);
        table.add(buttonCard22);
        buttonArrays.add(buttonCard22);
        buttonCard22.addActionListener(this);
        table.add(buttonCard23);
        buttonArrays.add(buttonCard23);
        buttonCard23.addActionListener(this);
        table.add(buttonCard24);
        buttonArrays.add(buttonCard24);
        buttonCard24.addActionListener(this);





    }
    public void dealer(ArrayList<ButtonCard> buttonArrays, ArrayList<Card> arrayCard,HashMap<ButtonCard,Card> hashMap){
        //ManaBar.setManaCount();
        manaBarLeft.manaPrint();
        manaBarRight.manaPrint();
        arrayCard.clear();
        gameData.addDeck(MainFrame.card1,MainFrame.card2,MainFrame.card3,MainFrame.card4,MainFrame.card5,MainFrame.card6,
                MainFrame.card7,MainFrame.card8,MainFrame.card9,MainFrame.card10,MainFrame.card11,MainFrame.card12,
                MainFrame.card13,MainFrame.card14,MainFrame.card15,MainFrame.card16,MainFrame.card17,MainFrame.card18,
                MainFrame.card19,MainFrame.card20,MainFrame.card21,MainFrame.card22,MainFrame.card23,MainFrame.card24);
        for (Map.Entry<ButtonCard,Card> entry: hashMap.entrySet()){
            entry.getKey().setIcon(Table.cardFront);
            entry.getValue().setStatus(STATUS.CLOSE);
        }
        for (int i=0; i<buttonArrays.size(); i++){
            hashMap.put(buttonArrays.get(i),arrayCard.get(i));

        }
    }
    public void gameOver(){

        if (ManaBar.manaCount==0 && !gameData.deckCount()){
            table.setVisible(false);
            loseScreen.setVisible(true);
        }else if (ManaBar.manaCount!=0 && gameData.deckCount()){
            table.setVisible(false);
            winScreen.setVisible(true);
            winScreen.wisdomPrint();
        }
    }




    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(backWin)){
            menu.setVisible(true);
            winScreen.setVisible(false);
        }
        if (e.getSource().equals(backLose)){
            menu.setVisible(true);
            loseScreen.setVisible(false);
        }
        if (e.getSource().equals(credits)){
            menu.setVisible(false);
            aboutGame.setVisible(true);
        }
        if (e.getSource().equals(exit)){
            System.exit(0);
        }
        if (e.getSource().equals(back)){
            menu.setVisible(true);
            aboutGame.setVisible(false);
        }
        if (e.getSource().equals(startGame)){

            dealer(buttonArrays,gameData.deck,gameData.cardMap);
            menu.setVisible(false);
            aboutGame.setVisible(false);
            difScreen.setVisible(true);

        }
        if (e.getSource().equals(back1)){
            menu.setVisible(true);
            aboutGame.setVisible(false);
            difScreen.setVisible(false);
        }
        if (e.getSource().equals(easy)){
            menu.setVisible(false);
            aboutGame.setVisible(false);
            difScreen.setVisible(false);
            table.setVisible(true);
            manaBarLeft.easyMode();
            manaBarRight.easyMode();
        }
        if (e.getSource().equals(middle)){
            menu.setVisible(false);
            aboutGame.setVisible(false);
            difScreen.setVisible(false);
            table.setVisible(true);
            manaBarLeft.middleMode();
            manaBarRight.middleMode();
        }
        if (e.getSource().equals(hard)){
            menu.setVisible(false);
            aboutGame.setVisible(false);
            difScreen.setVisible(false);
            table.setVisible(true);
            manaBarLeft.hardMode();
            manaBarRight.hardMode();
        }
        if(e.getSource().equals(buttonCard1)){
            Card card=gameData.cardMap.get(buttonCard1);
            gameData.closeCard();
            buttonCard1.setIcon(card.getImageFace());
            gameData.checkPair(card);
            manaBarLeft.manaWaste();
            manaBarLeft.manaPrint();
            manaBarRight.manaPrint();
            gameOver();


        }
        if(e.getSource().equals(buttonCard2)){
            gameData.closeCard();
            Card card=gameData.cardMap.get(buttonCard2);
            buttonCard2.setIcon(card.getImageFace());
            gameData.checkPair(card);
            manaBarLeft.manaWaste();
            manaBarLeft.manaPrint();
            manaBarRight.manaPrint();
            gameOver();
        }
        if(e.getSource().equals(buttonCard3)){
            gameData.closeCard();
            Card card=gameData.cardMap.get(buttonCard3);
            buttonCard3.setIcon(card.getImageFace());
            gameData.checkPair(card);
            manaBarLeft.manaWaste();
            manaBarLeft.manaPrint();
            manaBarRight.manaPrint();
            gameOver();
        }
        if(e.getSource().equals(buttonCard4)){
            gameData.closeCard();
            Card card=gameData.cardMap.get(buttonCard4);
            buttonCard4.setIcon(card.getImageFace());
            gameData.checkPair(card);
            manaBarLeft.manaWaste();
            manaBarLeft.manaPrint();
            manaBarRight.manaPrint();
            gameOver();
        }
        if(e.getSource().equals(buttonCard5)){
            gameData.closeCard();
            Card card=gameData.cardMap.get(buttonCard5);
            buttonCard5.setIcon(card.getImageFace());
            gameData.checkPair(card);
            manaBarLeft.manaWaste();
            manaBarLeft.manaPrint();
            manaBarRight.manaPrint();
            gameOver();
        }
        if(e.getSource().equals(buttonCard6)){
            gameData.closeCard();
            Card card=gameData.cardMap.get(buttonCard6);
            buttonCard6.setIcon(card.getImageFace());
            gameData.checkPair(card);
            manaBarLeft.manaWaste();
            manaBarLeft.manaPrint();
            manaBarRight.manaPrint();
            gameOver();
        }
        if(e.getSource().equals(buttonCard7)){
            gameData.closeCard();
            Card card=gameData.cardMap.get(buttonCard7);
            buttonCard7.setIcon(card.getImageFace());
            gameData.checkPair(card);
            manaBarLeft.manaWaste();
            manaBarLeft.manaPrint();
            manaBarRight.manaPrint();
            gameOver();
        }
        if(e.getSource().equals(buttonCard8)){
            gameData.closeCard();
            Card card=gameData.cardMap.get(buttonCard8);
            buttonCard8.setIcon(card.getImageFace());
            gameData.checkPair(card);
            manaBarLeft.manaWaste();
            manaBarLeft.manaPrint();
            manaBarRight.manaPrint();
            gameOver();
        }
        if(e.getSource().equals(buttonCard9)){
            gameData.closeCard();
            Card card=gameData.cardMap.get(buttonCard9);
            buttonCard9.setIcon(card.getImageFace());
            gameData.checkPair(card);
            manaBarLeft.manaWaste();
            manaBarLeft.manaPrint();
            manaBarRight.manaPrint();
            gameOver();
        }
        if(e.getSource().equals(buttonCard10)){
            gameData.closeCard();
            Card card=gameData.cardMap.get(buttonCard10);
            buttonCard10.setIcon(card.getImageFace());
            gameData.checkPair(card);
            manaBarLeft.manaWaste();
            manaBarLeft.manaPrint();
            manaBarRight.manaPrint();
            gameOver();
        }
        if(e.getSource().equals(buttonCard11)){
            gameData.closeCard();
            Card card=gameData.cardMap.get(buttonCard11);
            buttonCard11.setIcon(card.getImageFace());
            gameData.checkPair(card);
            manaBarLeft.manaWaste();
            manaBarLeft.manaPrint();
            manaBarRight.manaPrint();
            gameOver();
        }
        if(e.getSource().equals(buttonCard12)){
            gameData.closeCard();
            Card card=gameData.cardMap.get(buttonCard12);
            buttonCard12.setIcon(card.getImageFace());
            gameData.checkPair(card);
            manaBarLeft.manaWaste();
            manaBarLeft.manaPrint();
            manaBarRight.manaPrint();
            gameOver();
        }
        if(e.getSource().equals(buttonCard13)){
            gameData.closeCard();
            Card card=gameData.cardMap.get(buttonCard13);
            buttonCard13.setIcon(card.getImageFace());
            gameData.checkPair(card);
            manaBarLeft.manaWaste();
            manaBarLeft.manaPrint();
            manaBarRight.manaPrint();
            gameOver();
        }
        if(e.getSource().equals(buttonCard14)){
            gameData.closeCard();
            Card card=gameData.cardMap.get(buttonCard14);
            buttonCard14.setIcon(card.getImageFace());
            gameData.checkPair(card);
            manaBarLeft.manaWaste();
            manaBarLeft.manaPrint();
            manaBarRight.manaPrint();
            gameOver();
        }
        if(e.getSource().equals(buttonCard15)){
            gameData.closeCard();
            Card card=gameData.cardMap.get(buttonCard15);
            buttonCard15.setIcon(card.getImageFace());
            gameData.checkPair(card);
            manaBarLeft.manaWaste();
            manaBarLeft.manaPrint();
            manaBarRight.manaPrint();
            gameOver();
        }
        if(e.getSource().equals(buttonCard16)){
            gameData.closeCard();
            Card card=gameData.cardMap.get(buttonCard16);
            buttonCard16.setIcon(card.getImageFace());
            gameData.checkPair(card);
            manaBarLeft.manaWaste();
            manaBarLeft.manaPrint();
            manaBarRight.manaPrint();
            gameOver();
        }
        if(e.getSource().equals(buttonCard17)){
            gameData.closeCard();
            Card card=gameData.cardMap.get(buttonCard17);
            buttonCard17.setIcon(card.getImageFace());
            gameData.checkPair(card);
            manaBarLeft.manaWaste();
            manaBarLeft.manaPrint();
            manaBarRight.manaPrint();
            gameOver();
        }
        if(e.getSource().equals(buttonCard18)){
            gameData.closeCard();
            Card card=gameData.cardMap.get(buttonCard18);
            buttonCard18.setIcon(card.getImageFace());
            gameData.checkPair(card);
            manaBarLeft.manaWaste();
            manaBarLeft.manaPrint();
            manaBarRight.manaPrint();
            gameOver();
        }
        if(e.getSource().equals(buttonCard19)){
            gameData.closeCard();
            Card card=gameData.cardMap.get(buttonCard19);
            buttonCard19.setIcon(card.getImageFace());
            gameData.checkPair(card);
            manaBarLeft.manaWaste();
            manaBarLeft.manaPrint();
            manaBarRight.manaPrint();
            gameOver();
        }
        if(e.getSource().equals(buttonCard20)){
            gameData.closeCard();
            Card card=gameData.cardMap.get(buttonCard20);
            buttonCard20.setIcon(card.getImageFace());
            gameData.checkPair(card);
            manaBarLeft.manaWaste();
            manaBarLeft.manaPrint();
            manaBarRight.manaPrint();
            gameOver();
        }
        if(e.getSource().equals(buttonCard21)){
            gameData.closeCard();
            Card card=gameData.cardMap.get(buttonCard21);
            buttonCard21.setIcon(card.getImageFace());
            gameData.checkPair(card);
            manaBarLeft.manaWaste();
            manaBarLeft.manaPrint();
            manaBarRight.manaPrint();
            gameOver();
        }
        if(e.getSource().equals(buttonCard22)){
            gameData.closeCard();
            Card card=gameData.cardMap.get(buttonCard22);
            buttonCard22.setIcon(card.getImageFace());
            gameData.checkPair(card);
            manaBarLeft.manaWaste();
            manaBarLeft.manaPrint();
            manaBarRight.manaPrint();
            gameOver();
        }
        if(e.getSource().equals(buttonCard23)){
            gameData.closeCard();
            Card card=gameData.cardMap.get(buttonCard23);
            buttonCard23.setIcon(card.getImageFace());
            gameData.checkPair(card);
            manaBarLeft.manaWaste();
            manaBarLeft.manaPrint();
            manaBarRight.manaPrint();
            gameOver();
        }
        if(e.getSource().equals(buttonCard24)){
            gameData.closeCard();
            Card card=gameData.cardMap.get(buttonCard24);
            buttonCard24.setIcon(card.getImageFace());
            gameData.checkPair(card);
            manaBarLeft.manaWaste();
            manaBarLeft.manaPrint();
            manaBarRight.manaPrint();
            gameOver();
        }
    }
}
 class Background extends JLabel{
     static ImageIcon back1= new ImageIcon("res/Background1.jpg");

     Background(){
         setIcon(back1);
         setVisible(true);
         setOpaque(true);
         setSize(MainFrame.WIDTH,MainFrame.HEIGHT);


     }

}

class AboutGame extends JLabel{

    ImageIcon aboutText= new ImageIcon("res/ОбИгре.png");


    int x=272;
    int y=530;


    AboutGame(){

        setIcon(aboutText);
        setVisible(false);
        setOpaque(false);
        setSize(700,700);
        setBackground(Color.red);
        setLocation(250,50);

    }

}
class Menu extends JLabel {

    ImageIcon menu= new ImageIcon("res/Меню.png");

    Menu(){

        setIcon(menu);
        setVisible(true);
        setOpaque(false);
        setSize(700,700);
        setBackground(Color.red);
        setLocation(250,50);


    }


}

class DifScreen extends JLabel{

    ImageIcon difMenu= new ImageIcon("res/Сложность.png");
    DifScreen(){
        setIcon(difMenu);
        setVisible(false);
        setOpaque(false);
        setSize(700,700);
        setBackground(Color.red);
        setLocation(250,50);
    }
}
class WinScreen extends JLabel{

    ImageIcon winIcon= new ImageIcon("res/Победа.png");

    String wisdom0 = "";
    String wisdom1 = "Сливочное пиво получают";
    //String wisdom1A = "не из сливок";
    String wisdom2 = "Не копай под себя";
    String wisdom3 = "Эльф гному не товарищ";
    //String wisdom4 = "Когда наступит Фимбулвинтер,";
    String wisdom4A = "не ешь жёлтый снег";
    String wisdom5 = "Лорд Властон-чмо";
    //String wisdom6 = "Не доверяй парню";
    String wisdom6A = "с фамилией Энтропия";
    String wisdom7 = "Царская водка - не водка";
    String wisdom8 = "СКАЛА И КАМЕНЬ!!!";
    String wisdom9 = "ЧЕСТЬ, УВАЖЕНИЕ, ПИВО!!!";
    String wisdom10 = "Кольца власти - отстой";
    String wisdom11 = "Marvel опошлили Тора";
    //String wisdom12 = "Женщине с бородой плохо,";
    String wisdom12A = "без неё ещё хуже";
    String wisdom13 = "Marvel опошлили Тора";
    String wisdom14 = "Хочешь жить, умей дышать";
    String wisdom15 = "Наcтолка по Дюне - скам";


    ArrayList<String> wisdomList= new ArrayList<>();
    ArrayList<String> wisdomList2= new ArrayList<>();

    WinScreen(){

        setIcon(winIcon);
        setVisible(false);
        setOpaque(false);
        setSize(700,700);
        setBackground(Color.red);
        setLocation(250,50);
        setHorizontalTextPosition(CENTER);
        setVerticalTextPosition(CENTER);
        setForeground(new Color(35, 212, 28, 255));
        setFont(new Font("Amazon",Font.BOLD,25));
        wisdomList.add(wisdom1);
        wisdomList.add(wisdom2);
        wisdomList.add(wisdom3);
        //wisdomList.add(wisdom4);
        wisdomList.add(wisdom5);
        //wisdomList.add(wisdom6);
        wisdomList.add(wisdom7);
        wisdomList.add(wisdom8);
        wisdomList.add(wisdom9);
        wisdomList.add(wisdom10);
        wisdomList.add(wisdom11);
        //wisdomList.add(wisdom12);
        wisdomList.add(wisdom13);
        wisdomList.add(wisdom14);
        wisdomList.add(wisdom15);
        //wisdomList2.add(wisdom1A);
        wisdomList2.add(wisdom0);
        wisdomList2.add(wisdom0);
        wisdomList2.add(wisdom4A);
        wisdomList2.add(wisdom0);
        wisdomList2.add(wisdom6A);
        wisdomList2.add(wisdom0);
        wisdomList2.add(wisdom0);
        wisdomList2.add(wisdom0);
        wisdomList2.add(wisdom0);
        wisdomList2.add(wisdom0);
        wisdomList2.add(wisdom12A);
        wisdomList2.add(wisdom0);
        wisdomList2.add(wisdom0);
        wisdomList2.add(wisdom0);


    }
    void wisdomPrint(){
        int index = (int) (Math.random()*11);
        setText(wisdomList.get(index));

    }

}
class LoseScreen extends JLabel{

    ImageIcon loseIcon= new ImageIcon("res/Поражение.png");


    int x=272;
    int y=530;


    LoseScreen(){

        setIcon(loseIcon);
        setVisible(false);
        setOpaque(false);
        setSize(700,700);
        setBackground(Color.red);
        setLocation(250,50);

    }

}

    //Игровой стол
class Table extends JLabel{

    GameData gameData=new GameData();
    static  ImageIcon cardFront = new ImageIcon("res/Рубашка.png");




    Table(){


        setVisible(false);
        setOpaque(false);
        setSize(MainFrame.WIDTH,MainFrame.HEIGHT);




    }




}
class ButtonCard extends JButton{
    ImageIcon front;
    ImageIcon back;
    ButtonCard(Card card, int x, int y){
        setSize(MainFrame.CARD_SIZE,MainFrame.CARD_SIZE);
        this. front=card.imageFace;
        this.back=card.imageShirt;
        setVisible(true);
        setOpaque(false);
        setIcon(back);
        setLocation(x,y);
    }


}
class ManaBar extends JProgressBar{

    public static void setManaCount() {
        ManaBar.manaCount = 100;
    }

    static int manaCount=100;


    ManaBar(int x, int y){
        setValue(manaCount);
        setBounds(x,y, 50,769);

        setOrientation(VERTICAL);
        setBackground(Color.BLACK);
        setForeground(new Color(0,191,255));
        setBorderPainted(false);
        setFont(new Font("ALGERIAN",Font.BOLD,25));
    }
    void manaWaste(){
        manaCount--;

    }
    void easyMode(){
        setMaximum(10000);
        setVisible(false);
        manaCount=10000;
    }
    void middleMode(){
        setMaximum(100);
        setVisible(true);
        manaCount=100;
        manaPrint();
    }
    void hardMode(){
        setMaximum(50);
        setVisible(true);
        manaCount=50;
        manaPrint();
    }
    void manaPrint(){
        setValue(manaCount);
    }
}
class GameData{
    HashMap<ButtonCard,Card> cardMap=new HashMap<>();

    ArrayList<Card>deck=new ArrayList<>();

    public boolean deckCount(){
        int count=0;
        for (Card card: deck){
            if (card.getStatus().equals(STATUS.FOUND)){
                count++;

            }
        }
        return count == 24;
    }


    ArrayList<Card>checkArray=new ArrayList<>(2);
    public void addDeck(Card ... cards){
        deck.addAll(Arrays.asList(cards));
        Collections.shuffle(deck);
    }
    public void closeCard(){
        for (Map.Entry<ButtonCard,Card> entry: cardMap.entrySet()){
            if (entry.getValue().getStatus()==STATUS.CLOSE){
                entry.getKey().setIcon(Table.cardFront);
            }
            if (entry.getValue().getStatus()==STATUS.FOUND){

            }
        }
    }


    public void checkPair(Card card){
        if (!card.getStatus().equals(STATUS.FOUND)){
            card.setStatus(STATUS.OPEN);

        if (!checkArray.contains(checkArray)){
            checkArray.add(card);
        }

        if (checkArray.size()==2) {
            boolean pairFind = pairEquals(checkArray.get(0), checkArray.get(1));
            if (pairFind) {
                checkArray.get(0).setStatus(STATUS.FOUND);
                checkArray.get(1).setStatus(STATUS.FOUND);
                checkArray.clear();


            } else {
                checkArray.get(0).setStatus(STATUS.CLOSE);
                checkArray.get(1).setStatus(STATUS.CLOSE);
                checkArray.clear();


            }
        }
        }


    }
    public boolean  pairEquals(Card card1, Card card2){
        int x=card1.getNumberPair();
        int y=card2.getNumberPair();

        int a=card1.getNumber();
        int b=card2.getNumber();

        return x == y && a != b;

    }


}

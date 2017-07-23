package com.zhoudm;
import java.awt.*;
import javax.swing.*;
//public class Main extends JFrame {

// public static void main(String[] args) {
// write your code here
//  }
public class Draw extends JFrame
{
    MyPanel mp = null ;

    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        Draw qwe = new Draw();

    }

    public Draw()
    {
        mp = new MyPanel();

        this.add(mp);
        this.setSize(400,300);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

class MyPanel extends JPanel    //我自己的面板，用于绘图和实现绘图区域
{
    //覆盖JPanel的paint方法
    //Graphics是绘图的重要类，可以理解成一支画笔
    public void paint(Graphics g)
    {
        //1.调用父类函数完成初始化
        super.paint(g);     //这句话不能少
        //System.out.println("被调用");        //证明别调用

        //画圆
        int [][] drawnum={{1,0,1,1},
                          {0,1,0,1},
                          {1,0,1,1},
                          {1,1,0,1}};
        for(int i=0;i<drawnum.length;i++){
            for(int j=0;j<drawnum[0].length;j++){
                if(drawnum[i][j]==1){
                    g.drawOval(30*i+50,30*j+50,25,25);
                    g.setColor(Color.BLUE);
                }
            }
        }
      //  g.drawOval(10, 10, 30, 30);
        //画直线
      //  g.drawLine(20, 30, 20, 80);
        //画出矩形边框
    //    g.drawRect(50, 50, 100, 50);
        //画填充矩形
     //   g.setColor(Color.BLUE);     //设置颜色
      //  g.fillRect(80,60,40,60);

    }
}
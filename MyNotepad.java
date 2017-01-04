import java.awt.*;
import java.awt.datatransfer.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.awt.BorderLayout;
import java.util.*;
class SupportPad extends KeyAdapter{
//MyNotepad my=new MyNotepad();
static boolean mb=false;
public void keyTyped(KeyEvent e){
mb=true;
System.out.println("vvv"+mb);

}


}
class MyNotepad extends WindowAdapter implements ActionListener{
boolean b=false;
Runtime r;
JTextArea jtf;
JPanel jp;
JFrame jf;
JScrollBar jsb;
JScrollPane jsp,jsp1;
SupportPad p=new SupportPad();
MyNotepad np;
MouseEvent en;
JFileChooser jfc;
JMenuBar jmb;
JMenuItem jmi,jmi1,jmi2,jmi3,jmi4,jmi5;
JMenu jm,jm1,jm2,jm3,jm4,jm5;
JFrame j;
JDialog jd;
JButton jb1,jb2,jb3,jbclose1,jbclose2,jbclose3;
JTextField jt1,jt2;
MyNotepad(){
jp=new JPanel();
j=new JFrame("Replace");
//j1=new JFrame("Go-To");
jbclose1=new JButton("Save");
jbclose2=new JButton("don't-Save");
jbclose3=new JButton("Cancel");

jbclose1.setBounds(15,80,100,30);
jbclose2.setBounds(125,80,100,30);
jbclose3.setBounds(235,80,100,30);
//jtgoto=new JTextField();
jb1=new JButton("Replace");
jb2=new JButton("Replace All");
jb3=new JButton("Cancel");
jt1=new JTextField();
jt2=new JTextField();
//g.drawString(5,20,"Find What");
jt1.setBounds(80,20,155,30);
jt2.setBounds(80,56,155,30);
jb1.setBounds(240,20,98,30);
jb2.setBounds(240,56,98,30);
jb3.setBounds(240,92,98,30);
jb1.addActionListener(this);
jb2.addActionListener(this);
jb3.addActionListener(this);
j.add(jb1);
j.add(jb2);
j.add(jb3);
j.add(jt1);
j.add(jt2);
j.setSize(360,200);
j.setLocation(250,250);
j.setLayout(null);
jfc=new JFileChooser();
System.out.println("hello");
jtf=new JTextArea();
jf=new JFrame();
r=Runtime.getRuntime();
jd=new JDialog();
jsp=new JScrollPane(jtf);
jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            
 jf.add(jsp,BorderLayout.CENTER);
//jsp1=new JScrollPane(jtf);
//jsp.setBounds(50,60,320,150);
//jsp1.setBounds(50,270,320,150);
//jsb=new JScrollBar();
//jsp.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//jsp.setBounds(100,60,320,150);
//jf.getContentPane().add(jsp);

//jf.add(jsp);
jbclose1.addActionListener(this);
jbclose2.addActionListener(this);
jbclose3.addActionListener(this);
jd.add(jbclose1);
jd.add(jbclose2);
jd.add(jbclose3);
jd.setSize(360,200);
jd.setLayout(null);
jmb=new JMenuBar();

//jmi=new JMenuItem();
jm=new JMenu("File");
jm1=new JMenu("Edit");
jm2=new JMenu("Format");
jm3=new JMenu("About");
jm4=new JMenu("JCompile");
jm5=new JMenu("JRun");

//jf.add(jtf);
//jm.setMnemonic(KeyEvent.VK_F);
jmb.add(jm);
jmb.add(jm1);
jmb.add(jm2);
jmb.add(jm3);
jmb.add(jm4);
jmb.add(jm5);
jp.add(jmb);
jf.add(jp,BorderLayout.NORTH);

ButtonGroup bg=new ButtonGroup();

jmi=new JMenuItem("New",KeyEvent.VK_F);
jmi.addActionListener(this);
jmi.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
bg.add(jmi);
jm.add(jmi);

jmi=new JMenuItem("Open...",KeyEvent.VK_T);
jmi.addActionListener(this);
jmi.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.ALT_MASK));
bg.add(jmi);
jm.add(jmi);

jmi=new JMenuItem("Save",KeyEvent.VK_T);
jmi.addActionListener(this);
jmi.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.ALT_MASK));
bg.add(jmi);
jm.add(jmi);

jmi=new JMenuItem("Save As...",KeyEvent.VK_T);
jmi.addActionListener(this);
jmi.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_1, ActionEvent.ALT_MASK));
bg.add(jmi);
jm.add(jmi);
jm.addSeparator();
jmi=new JMenuItem("Exit",KeyEvent.VK_T);
jmi.addActionListener(this);
jmi.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_2, ActionEvent.ALT_MASK));
bg.add(jmi);
jm.add(jmi);
//jm1.setMnemonic(KeyEvent.VK_F);

jmi1=new JMenuItem("Cut",KeyEvent.VK_T);
jmi1.addActionListener(this);
jmi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
bg.add(jmi1);
jm1.add(jmi1);

jmi1=new JMenuItem("Copy",KeyEvent.VK_T);
jmi1.addActionListener(this);
jmi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
bg.add(jmi1);
jm1.add(jmi1);


jmi1=new JMenuItem("Paste",KeyEvent.VK_T);
jmi1.addActionListener(this);
jmi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
bg.add(jmi1);
jm1.add(jmi1);
jm1.addSeparator();
jmi1=new JMenuItem("Delete",KeyEvent.VK_T);
jmi1.addActionListener(this);
jmi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK));
bg.add(jmi1);
jm1.add(jmi1);
jm1.addSeparator();
jmi1=new JMenuItem("Replace",KeyEvent.VK_T);
jmi1.addActionListener(this);
jmi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.CTRL_MASK));
bg.add(jmi1);
jm1.add(jmi1);

jmi1=new JMenuItem("Select All",KeyEvent.VK_T);
jmi1.addActionListener(this);
jmi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
bg.add(jmi1);
jm1.add(jmi1);
jm1.addSeparator();
jmi1=new JMenuItem("Date/Time",KeyEvent.VK_T);
jmi1.addActionListener(this);
jmi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
bg.add(jmi1);
jm1.add(jmi1);

jmi2=new JMenuItem("Word Wrap",KeyEvent.VK_T);
jmi2.addActionListener(this);
//jmi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
bg.add(jmi2);
jm2.add(jmi2);

jmi2=new JMenuItem("Font...",KeyEvent.VK_T);
jmi2.addActionListener(this);
//jmi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
bg.add(jmi2);
jm2.add(jmi2);

jmi3=new JMenuItem("About MyNotepad",KeyEvent.VK_T);
jmi3.addActionListener(this);
//jmi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
bg.add(jmi3);
jm3.add(jmi3);

jmi4=new JMenuItem("Compile",KeyEvent.VK_T);
jmi4.addActionListener(this);
//jmi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
bg.add(jmi4);
jm4.add(jmi4);

jmi5=new JMenuItem("Run...",KeyEvent.VK_T);
jmi5.addActionListener(this);
//jmi1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
bg.add(jmi5);
jm5.add(jmi5);


    WindowUtilities.setNativeLookAndFeel();
jd.setLocation(250,350);
//jtf.addMouseListener(this);
jf.addWindowListener(this);
//jtf.addDocumentListener(this);
jtf.addKeyListener(new SupportPad());
jf.setJMenuBar(jmb);

jf.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
jf.setSize(550,600);
jf.setLocation(150,100);
jf.setVisible(true);
}
public void windowClosing(WindowEvent en1){
System.out.println("kkks"+p.mb);
if(SupportPad.mb==true){
System.out.println("kkklkl");
jd.setVisible(true);
//System.exit(0);
}
else
System.exit(0);
}
public void mouseClicked(MouseEvent en){

System.out.println(en.getX());
this.en=en;

}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==jbclose1){
File f=jfc.getSelectedFile();
System.out.println(jfc.getSelectedFile());
if(p.mb==true){
if(f!=null){
try{
//jd.setVisible(false);
FileOutputStream pw=new FileOutputStream(f);
File fo=jfc.getCurrentDirectory();
StringBuffer g=new StringBuffer(fo.toString());

System.out.println(g); 
String s1;
s1=jtf.getText();
byte b[]=s1.getBytes();
pw.write(b);

}
catch(Exception e1){}
System.exit(0);
}
else{
jd.setVisible(false);
if(jfc.showSaveDialog(null)==JFileChooser.APPROVE_OPTION)
{
try{

File f1=jfc.getSelectedFile();
System.out.println(f);
FileOutputStream pw=new FileOutputStream(f1);
//byte b[]=new byte[pw.available()];
//pw.read(b);
//String s1;
String s1;
s1=jtf.getText();
byte b[]=s1.getBytes();
pw.write(b);
}
catch(Exception e1){}
}

}
}
System.exit(0);
}
if(e.getSource()==jbclose2){
//jd.setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
//jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
System.exit(0);
}

if(e.getSource()==jbclose3){
//jd.setDefaultCloseOperation(JDialog.EXIT_ON_CLOSE);
//jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//System.exit(0);
jd.setVisible(false);
}
if(e.getActionCommand().equals("Exit"))
System.exit(0);

if(e.getActionCommand().equals("New"))
{
System.out.println("ppp");
jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
jf=null;
new MyNotepad();
}

if(e.getActionCommand().equals("Open..."))
{
//int x=jfc.showOpenDialog(null); //showSaveDialog(null)

if(jfc.showOpenDialog(null)==JFileChooser.APPROVE_OPTION)
{
try{
File f=jfc.getSelectedFile();
System.out.println(f.getName());
FileInputStream pw=new FileInputStream(f);
byte b[]=new byte[pw.available()];
pw.read(b);
String s1=new String(b);
jtf.setText(s1);
}
catch(Exception e1){}
}
}


if(e.getActionCommand().equals("Save As..."))
{
//int x=jfc.showOpenDialog(null); //showSaveDialog(null)

if(jfc.showSaveDialog(null)==JFileChooser.APPROVE_OPTION)
{
try{
File f=jfc.getSelectedFile();
System.out.println(f);
FileOutputStream pw=new FileOutputStream(f);
//byte b[]=new byte[pw.available()];
//pw.read(b);
//String s1;
String s1;
s1=jtf.getText();
byte b[]=s1.getBytes();
pw.write(b);
}
catch(Exception e1){}
}
SupportPad.mb=false;
}

if(e.getActionCommand().equals("Save"))
{
try{
File f=jfc.getSelectedFile();
FileOutputStream pw=new FileOutputStream(f);
File fo=jfc.getCurrentDirectory();
StringBuffer g=new StringBuffer(fo.toString());

System.out.println(g); 
String s1;
s1=jtf.getText();
byte b[]=s1.getBytes();
pw.write(b);

}
catch(Exception e1){}
SupportPad.mb=false;
}

if(e.getActionCommand().equals("Cut"))
{
jtf.cut();
}

if(e.getActionCommand().equals("Copy"))
{
jtf.copy();
}

if(e.getActionCommand().equals("Paste"))
{
System.out.println("ppp111");
jtf.paste();
}
if(e.getActionCommand().equals("Delete"))
{
System.out.println("ppp222");
jtf.cut();
System.out.println(jtf.getSelectedText());
StringSelection sl=null;
Clipboard c=Toolkit.getDefaultToolkit().getSystemClipboard();
c=null;
//jtf.paste();
}

if(e.getActionCommand().equals("Replace"))
{
j.setVisible(true);
}

if(e.getSource()==jb1){

}
if(e.getSource()==jb2){
try{
File f=jfc.getSelectedFile();
//System.out.println(f);
String s1=jt1.getText();
String s3=jt2.getText();
//System.out.println(s1);
//System.out.println(s3);
FileInputStream fi=new FileInputStream(f);
byte b[]=new byte[fi.available()];
fi.read(b);
String sp=new String(b);
//System.out.println(sp);
ByteArrayOutputStream fw=new ByteArrayOutputStream();

String ff=sp.replace(s1,s3);

fi.close();
byte ch[]=ff.getBytes();
fw.write(ch);
fw.writeTo(new FileOutputStream(f));
FileInputStream pw=new FileInputStream(f);
byte bi[]=new byte[pw.available()];
pw.read(bi);

String s11=new String(bi);
jtf.setText(s11);
}
catch(Exception ep){}
}

if(e.getActionCommand().equals("Select All"))
{
jtf.selectAll();
}
if(e.getActionCommand().equals("Date/Time"))
{
Date d=new Date();
System.out.println(d);
String s1=d.toString();
//Point pos=jtf.getMousePosition();
int pos=jtf.getCaretPosition();
System.out.println(pos);
jtf.insert(s1,pos);
}

if(e.getActionCommand().equals("Compile"))
{
File f=jfc.getSelectedFile();
String fname=f.getName();
String result="";
if(!jtf.getText().equals(""))
{
try{
//fname=jtf.getText().trim()+".java";
FileWriter fw=new FileWriter(fname);
String s1=jtf.getText();
PrintWriter pw=new PrintWriter(fw);
pw.println(s1);
pw.flush();
Process error=r.exec("C://Program Files (x86)//Java//jdk1.8.0//bin//javac.exe -d . " +fname);
BufferedReader err=new BufferedReader(new InputStreamReader(error.getErrorStream()));
while(true){
String temp=err.readLine();
if(temp!=null){
result+=temp;
result+="\n";
}
else
break;
}
if(result.equals("")){
jtf.setText("compiled successfully"+fname);
err.close();
}
else
jtf.setText(result);
}
catch(Exception e1)
{
System.out.println(e1);
}
}
else
jtf.setText("please enter java program name!");


}
if(e.getActionCommand().equals("Run..."))
{
File f=jfc.getSelectedFile();
String fname=f.getName();
String result="";
StringTokenizer spq=new StringTokenizer(fname,".");
fname=spq.nextToken();
System.out.println(fname);


try{
//String fn=jtf.getText().trim();
//System.out.println(fn);
Process p=r.exec("C:\\Program Files (x86)\\Java\\jdk1.8.0\\bin\\java "+fname);
BufferedReader output=new BufferedReader(new InputStreamReader(p.getInputStream()));
BufferedReader error=new BufferedReader(new InputStreamReader(p.getErrorStream()));
while(true){
String temp=output.readLine();
if(temp!=null){
result+=temp;
result+="\n";
}
else
{
break;
}
}
if(result.equals(""))
{
while(true){
String temp=error.readLine();
if(temp!=null){
result+=temp;
result+="\n";
}
else
{
break;
}
}
}
output.close();
error.close();
jtf.setText(result);
}
catch(Exception e2){
System.out.println(e2);
}
}
}
public static void main(String...s){

new MyNotepad();

}


}


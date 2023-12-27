package oop.advanced.model.Account;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class ReadSeqFile extends Frame implements ActionListener {

    private TextField account, name, balance; //변수지정 int a,b,c;
    private Button next, done;
    private DataInputStream input; //필드에 입력되는 객체의 흐름을 input에 담겠다. 텍스트필드에 있던 스트림객체를 데이터인풋스트림에 담겠다.
    // 필드에 입력된 account, name, balance의 스트림객체를 담는 객체.

    public ReadSeqFile() {
        super("고객 파일을 읽겠습니다.");
        try {
            input = new DataInputStream(new FileInputStream("client.doc"));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e); //예외처리 범위 순서대로 표시
        } catch (IOException e1) {
            System.err.println(e1.toString());
            System.exit(1);
        }
        setSize(250, 150);
        setLayout(new GridLayout(4, 2));
        account = new TextField();
        account.setEditable(false);
        add(account);
        add(new Label("이름"));
        name = new TextField(20);
        name.setEditable(false);
        add(name);

        //balance Frame에 붙이기
        add(new Label("잔고"));
        balance = new TextField(20);
        balance.setEditable(false);
        add(balance);

        next = new Button("출력");
        next.addActionListener(this); //어떤 자기자신?
        add(next);

        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == next) readRecord(); //데이터를 한 레코드씩 읽는 메소드
        else closeFile();
    }

    public void closeFile() {
        try {
            input.close();
            System.exit(0);
        } catch (IOException io) {
            System.err.println(io.toString());
            System.exit(1);
        }
    }

    public void readRecord() {
        String accountNumber;
        double balance;
        String nameData;

        try {
            accountNumber = input.readUTF();
            nameData = input.readUTF();
            balance = input.readDouble();

            this.account.setText(String.valueOf(accountNumber));
            this.name.setText(nameData);
            this.balance.setText(String.valueOf(balance));

        } catch (EOFException e1) {
            closeFile();

        } catch (IOException e2) {
            System.err.println(e2.toString());
        }

    }

    public static void main(String[] args) {
        new ReadSeqFile();
    }
}
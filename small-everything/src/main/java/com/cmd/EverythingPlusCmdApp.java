package com.cmd;

import com.core.SmallEverythingManager;
import com.core.model.Condition;

import java.util.Scanner;

public class EverythingPlusCmdApp {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //欢迎
        welcome();

        //统一调度器
        SmallEverythingManager manager = SmallEverythingManager.getInstance();

        //交互式
        interactive(manager);
    }

    private static void interactive(SmallEverythingManager manager){
        while(true){
            System.out.println("everything >>");
            String input = scanner.nextLine();
            //优先处理search
            if(input.startsWith("search")){
                //search name [file_type]
                String[] values = input.split(" ");
                if(values.length >= 2){
                    if(!values[0].equals("search")){
                        help();
                        continue;
                    }
                    Condition condition = new Condition();
                    String name = values[1];
                    condition.setName(name);
                    if(values.length >= 3){
                        String fileType = values[2];
                        condition.setFileType(fileType.toUpperCase());
                    }
                    search(manager,condition);
                    continue;
                } else{
                    help();
                    continue;
                }
            }
            switch (input){
                case "help":
            }
        }
    }

    private static void search(SmallEverythingManager manager,Condition condition){
        System.out.println("检索功能");
        //统一调度器中的search
        //name fileType limit orderByAsc
        manager.search(condition);
    }

    private static void index(SmallEverythingManager manager){
        //统一调度器中的index
        new Thread(new Runnable() {
            @Override
            public void run() {
                manager.buildIndex();
            }
        }).start();
    }
    private static void quit(){

    }

    private static void welcome(){
        System.out.println("欢迎使用，Small Everything");
    }

    private static void help(){

    }
}

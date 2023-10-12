package com.myStudy.train.train1012.ex02;
/**
 *  학생 정보 프로그램
 *  요구사항 초기메뉴에서 1 , 2 , 3, 4 이외의 예외상황
 *  
 * */
public class PhoneExample {
    public static void main(String[] args)
    {
        int choice=0;

        while(true)
        {
            try
            {
                PhoneUi.mainMenu();
                choice = PhoneUi.sc.nextInt();
                PhoneUi.sc.nextLine();
                if(choice < PhoneMenu.INPUT_PHONEINFO || choice > PhoneMenu.PROGRAM_QUIT)
                    throw new MenuChoiceException(choice);

                switch(choice)
                {
                    case PhoneMenu.INPUT_PHONEINFO:
                        PhoneUi.inputMenu();
                        PhoneUi.inputMenuChoice();
                        break;
                    case PhoneMenu.SEARCH_PHONEINFO:
                        PhoneUi.searchPhoneInfo();
                        break;
                    case PhoneMenu.DELETE_PHONEINFO:
                        PhoneUi.deletePhoneInfo();
                        break;
                    case PhoneMenu.SHOW_ALL_PHONEINFO:
                        PhoneUi.showAllPhoneInfo();
                        break;
                    case PhoneMenu.PROGRAM_QUIT:
                        return;

                }
            }
            catch(MenuChoiceException e)
            {
                System.out.println(e.getMessage());
                e.showWrongMenu();
            }
        }
    }
}
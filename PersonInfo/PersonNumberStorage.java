package com.myStudy.train.train1012.ex01;

public class PersonNumberStorage extends PersonNumber
{
    PersonInfo[] perArr;
    int numOfPerInfo;

    public PersonNumberStorage(int sz)
    {
        perArr=new PersonInfo[sz];
        numOfPerInfo=0;
    }

    public void addPersonalInfo(String name, String perNum)
    {
        perArr[numOfPerInfo]=new PersonInfo(name, perNum);
        numOfPerInfo++;
    }

    public String searchName(String perNum)
    {
        for(int i=0; i<numOfPerInfo; i++)
        {
            if(perNum.compareTo(perArr[i].getNumber())==0)
                return perArr[i].getName();
        }
        return null;
    }
}

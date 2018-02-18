import java.io.*;
class ap
{ 
public static void main(String []arg)throws IOException
{
int i,j,m=0;
int t1=0;
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number of transaction :");
int n=Integer.parseInt(b.readLine());
System.out.println("items :1--Mango 2--Nuts 3--Corn 4--Apple  5--Toothbrush  6--Jar  7--Key-Chain  8-- Eggs  9-- Knife  10-  Chocolates  11-- Onion");
int item[][]=new int[n][11];
for(i=0;i<n;i++)
 for(j=0;j<11;j++)
   item[i][j]=0;
String[] itemlist={"MANGO","NUTS","CORN","APPLE","TOOTHBRUSH","JAR","KEY-CHAIN","EGGS","KNIFE","CHOCOLATES","ONION"};
int nt[]=new int[11];
int q[]=new int[11];
for(i=0;i<n;i++)
{ System.out.println("Transaction "+(i+1)+" :");
  for(j=0;j<11;j++)
  {  //System.out.println(itemlist[j]);
     System.out.println("Is Item "+itemlist[j]+" present in this transaction(1/0)? :");
     item[i][j]=Integer.parseInt(b.readLine()); 
  }
}
 for(j=0;j<11;j++) 
  { for(i=0;i<n;i++)
    {if(item[i][j]==1)
      nt[j]=nt[j]+1;
    }
    System.out.println("Number of Item "+itemlist[j]+" :"+nt[j]);
  }

for(j=0;j<11;j++)
{ if(((nt[j]/(float)n)*100)>=50)
    q[j]=1;
  else
    q[j]=0;

  if(q[j]==1)
   {t1++;
    System.out.println("Item "+itemlist[j]+" is selected "); 
   
   }
}
 for(j=0;j<11;j++) 
  { for(i=0;i<n;i++)
   {
     
     if(q[j]==0)
       { 
        item[i][j]=0;
       }
   }
   }

int nt1[][]=new int[11][11];
 for(j=0;j<11;j++) 
    {  for(m=j+1;m<11;m++) 
       { for(i=0;i<n;i++)
         { if(item[i][j]==1 &&item[i][m]==1)
           { nt1[j][m]=nt1[j][m]+1;
           }
         }
    if(nt1[j][m]!=0)
         System.out.println("Number of Items of  "+itemlist[j]+"& "+itemlist[m]+" :"+nt1[j][m]);
    }
  
   }
for(j=0;j<11;j++)
{ for(m=j+1;m<11;m++) 
  {
  if(((nt1[j][m]/(float)n)*100)>=50)
    q[j]=1;
  else
    q[j]=0;

  if(q[j]==1)
   {
    System.out.println("Item "+itemlist[j]+"& "+itemlist[m]+" is selected "); 
   
   }
}
}
} 
}

OUTPUT:
/*
Enter the number of transaction :
5
items :1--Mango 2--Nuts 3--Corn 4--Apple  5--Toothbrush  6--Jar  7--Key-Chain  8-- Eggs  9-- Knife  10-  Chocolates  11-- Onion
Transaction 1 :
Is Item MANGO present in this transaction(1/0)? :
1
Is Item NUTS present in this transaction(1/0)? :
0
Is Item CORN present in this transaction(1/0)? :
0
Is Item APPLE present in this transaction(1/0)? :
0
Is Item TOOTHBRUSH present in this transaction(1/0)? :
0
Is Item JAR present in this transaction(1/0)? :
1
Is Item KEY-CHAIN present in this transaction(1/0)? :
1
Is Item EGGS present in this transaction(1/0)? :
1
Is Item KNIFE present in this transaction(1/0)? :
0
Is Item CHOCOLATES present in this transaction(1/0)? :
1
Is Item ONION present in this transaction(1/0)? :
1
Transaction 2 :
Is Item MANGO present in this transaction(1/0)? :
0
Is Item NUTS present in this transaction(1/0)? :
1
Is Item CORN present in this transaction(1/0)? :
0
Is Item APPLE present in this transaction(1/0)? :
0
Is Item TOOTHBRUSH present in this transaction(1/0)? :
0
Is Item JAR present in this transaction(1/0)? :
1
Is Item KEY-CHAIN present in this transaction(1/0)? :
1
Is Item EGGS present in this transaction(1/0)? :
1
Is Item KNIFE present in this transaction(1/0)? :
0
Is Item CHOCOLATES present in this transaction(1/0)? :
1
Is Item ONION present in this transaction(1/0)? :
1
Transaction 3 :
Is Item MANGO present in this transaction(1/0)? :
1
Is Item NUTS present in this transaction(1/0)? :
0
Is Item CORN present in this transaction(1/0)? :
0
Is Item APPLE present in this transaction(1/0)? :
1
Is Item TOOTHBRUSH present in this transaction(1/0)? :
0
Is Item JAR present in this transaction(1/0)? :
0
Is Item KEY-CHAIN present in this transaction(1/0)? :
1
Is Item EGGS present in this transaction(1/0)? :
1
Is Item KNIFE present in this transaction(1/0)? :
0
Is Item CHOCOLATES present in this transaction(1/0)? :
0
Is Item ONION present in this transaction(1/0)? :
0
Transaction 4 :
Is Item MANGO present in this transaction(1/0)? :
1
Is Item NUTS present in this transaction(1/0)? :
0
Is Item CORN present in this transaction(1/0)? :
1
Is Item APPLE present in this transaction(1/0)? :
0
Is Item TOOTHBRUSH present in this transaction(1/0)? :
1
Is Item JAR present in this transaction(1/0)? :
0
Is Item KEY-CHAIN present in this transaction(1/0)? :
1
Is Item EGGS present in this transaction(1/0)? :
0
Is Item KNIFE present in this transaction(1/0)? :
0
Is Item CHOCOLATES present in this transaction(1/0)? :
1
Is Item ONION present in this transaction(1/0)? :
0
Transaction 5 :
Is Item MANGO present in this transaction(1/0)? :
0
Is Item NUTS present in this transaction(1/0)? :
0
Is Item CORN present in this transaction(1/0)? :
1
Is Item APPLE present in this transaction(1/0)? :
0
Is Item TOOTHBRUSH present in this transaction(1/0)? :
0
Is Item JAR present in this transaction(1/0)? :
0
Is Item KEY-CHAIN present in this transaction(1/0)? :
1
Is Item EGGS present in this transaction(1/0)? :
1
Is Item KNIFE present in this transaction(1/0)? :
1
Is Item CHOCOLATES present in this transaction(1/0)? :
0
Is Item ONION present in this transaction(1/0)? :
1
Number of Item MANGO :3
Number of Item NUTS :1
Number of Item CORN :2
Number of Item APPLE :1
Number of Item TOOTHBRUSH :1
Number of Item JAR :2
Number of Item KEY-CHAIN :5
Number of Item EGGS :4
Number of Item KNIFE :1
Number of Item CHOCOLATES :3
Number of Item ONION :3
Item MANGO is selected 
Item KEY-CHAIN is selected 
Item EGGS is selected 
Item CHOCOLATES is selected 
Item ONION is selected 
Number of Items of  MANGO& KEY-CHAIN :3
Number of Items of  MANGO& EGGS :2
Number of Items of  MANGO& CHOCOLATES :2
Number of Items of  MANGO& ONION :1
Number of Items of  KEY-CHAIN& EGGS :4
Number of Items of  KEY-CHAIN& CHOCOLATES :3
Number of Items of  KEY-CHAIN& ONION :3
Number of Items of  EGGS& CHOCOLATES :2
Number of Items of  EGGS& ONION :3
Number of Items of  CHOCOLATES& ONION :2
Item MANGO& KEY-CHAIN is selected 
Item KEY-CHAIN& EGGS is selected 
Item KEY-CHAIN& CHOCOLATES is selected 
Item KEY-CHAIN& ONION is selected 
Item EGGS& ONION is selected 

*/

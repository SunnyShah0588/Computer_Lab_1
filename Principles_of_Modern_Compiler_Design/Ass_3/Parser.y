%{
	#include<stdio.h>
	#include<string.h>
	int i;
struct symtab
{
char sname[10];
int value;

}stab[20];

int scnt=0;
int insert(char *tok);

%}

%union
{
	int v;
	char s[10];
}
%token <s> ID 
%token <v> NUM
%type <v> E
%left '+' '-'
%left '*' '/'
%nonassoc UMINUS

%%
stmtlist: stmtlist S
	| S
	
S : ID '=' E 	'\n'    {i=insert($1);stab[i].value=$3;}
  | E		'\n'		{printf("%d",$1);}
  ;
  
E : E '+' E			{$$=$1+$3;}
  | E '-' E			{$$=$1-$3;}
  | E '*' E			{$$=$1*$3;}
  | E '/' E			{$$=$1/$3;}
  | NUM				{$$=$1;}
  | ID				{i=insert($1);$$=stab[i].value;}
  ;
  
%%


int insert(char *tok)
{
	int i,flag=0;
	for(i=0;i<scnt;i++)
		{
			if(strcmp(stab[i].sname,tok)==0)
			{
				flag=1;
				return i;
			}
		}


if(flag==0)
{
strcpy(stab[scnt++].sname,tok);
return scnt-1;
}

}
main()
{
	
yyparse();
}
  


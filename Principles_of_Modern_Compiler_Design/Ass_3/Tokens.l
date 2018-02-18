%{
	#include "y.tab.h"
	
%}

%%

[-+*/()=]			{return yytext[0];}

[a-zA-Z_][a-zA-Z_0-9]*	{strcpy(yylval.s,yytext);	return ID;}
				
[0-9]+			{yylval.v=atoi(yytext);	return NUM;}
				

[$]				{return 0;}
[\n]				{return yytext[0];}

%%

int yyerror(char *s)
{
	printf("%s",s);	
}

int yywrap()
{
	return 0;
}


#include <stdio.h>


void reverse(char *str){
	printf("inside the function reverse---------\n");
	char * end = str;
	if(str){
		while(*end){
			end++;
		}
		end--;

		while(str<end){
			char temp = *str;
			*str++  = *end;
			*end-- = temp;
		}	
	}
}


int main(void) {
	// your code goes here
	printf("hello world\n");
	char* str = "helo";
	printf("%s\n",str);
	reverse(str);
	printf("%s\n",str);
	return 0;
}


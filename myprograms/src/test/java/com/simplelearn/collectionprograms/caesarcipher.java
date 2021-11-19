package com.simplelearn.collectionprograms;
import java.io.*;

public class caesarcipher 
{
	public static void main(String args[]) throws IOException
	{
		String input;
		System.out.println("enter string");
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		input=obj.readLine();
		int length;
		length=input.length();
		
		int ch;
		System.out.println("what do you want to do");
		System.out.println("1.encrytion");
		System.out.println("2.decryption");
		ch=Integer.parseInt(obj.readLine());
		
		int key;
		System.out.println("enter key?");
		key=Integer.parseInt(obj.readLine());
				
				int temp,i;
		char curr_char;
		String output="";
		if(ch==1)
		{
			for(i=0;i<length;i++)
			{
				curr_char=input.charAt(i);
				if((Character.isLowerCase(curr_char)))
				{
					curr_char=(char)((int)curr_char-97);
					output=output+(char)((curr_char+key)%26+97);
				}
				else if(Character.isUpperCase(curr_char))
				{
					curr_char=(char)((int)curr_char-65);
					output=output+(char)((curr_char+key)%26+65);
				}
				else
				{
					output=output+(char)(curr_char);
				}}
				System.out.println("Cipher text:"+output);
			}
			else
				if(ch==2)
				{
					for(i=0;i<length;i++)
					{
						curr_char=input.charAt(i);
						if(Character.isLowerCase(curr_char))
						{
							curr_char=(char)((int)curr_char-97);
							if(curr_char-key<0)
							{
								curr_char+=26;
							}
							output=output+(char)((curr_char-key)%26+97);
						}
						else if(Character.isUpperCase(curr_char))
						{
							curr_char=(char)((int)curr_char-65);
							
							if(curr_char-key<0)
							{
								curr_char+=26;
							}
							output=output+(char)((curr_char-key)%26+65);
						}
						else
						{
							output=output+(char)(curr_char);
						}}
					System.out.println("plain text"+output);
				}
				else
				{
				
		System.out.println("invalid choice");
	}}}



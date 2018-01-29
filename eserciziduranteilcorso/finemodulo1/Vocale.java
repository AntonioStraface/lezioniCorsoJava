package eserciziduranteilcorso.finemodulo1;

import java.sql.Array;
import java.util.Arrays;

public class Vocale
{
	/*
	public static void vocale (char [] arrayV, String caratteri)
	{
		int [] contatore	= contaCarattere(arrayV,caratteri);
		int posizione		= maggiore(contatore);
		char lettera		= caratteri.charAt(posizione);
		
		System.out.println("La lettera più comune è: "+lettera+".");

	}
	
	
	public static int[] contaCarattere(char [] arrayV, String caratteri)
	{
		
		
		for (int i=0;i<arrayV.length;i++)
		{
			for(int j=0; j<caratteri.length(); j++)
			{
				if(arrayV[i] == caratteri.charAt(j))
				{
					++occorrenze[j];
				}
			}
		}
		return occorrenze;
	}
	*/
	public static int maggiore(int [] contatore)
	{
		int posizione=-1, occorrenze=0;
		
		for (int i=0;i<contatore.length;i++)
		{
			if (contatore[i]>occorrenze)
			{
				posizione	= i;
				occorrenze	= contatore[i];
			}
		}
		return posizione;
	}



	

}

/**
 * 
 */

/**
 * @author dharmvir.singh
 *
 */
package com.cmcc.sunyiwei.core;

public class TestCrypto {
	public static final String DES_ENCRYPTION_KEY = "testString";
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try{
		String input  = "试试中文行不行";
		String encrypted = Cryptography.encrypt(input, DES_ENCRYPTION_KEY);
		System.out.println(encrypted);
		String decrypted = Cryptography.decrypt(encrypted, DES_ENCRYPTION_KEY);
		System.out.println(decrypted);
		}catch(Exception e){
			
		}
	}

}

package com.cmcc.sunywei.util;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/**
 * DES加密
 * @author 王海
 *
 */
public class DESCoder {
	/**
	 * 加密0向量
	 */
	private static byte[] iv = {1,2,3,4,5,6,7,8};
	
	private static final String k = "sf-10086";
	/**
	 * des加密
	 * @param encryptString 需要加密的字符串
	 * @param encryptKey 加密密钥
	 * @return 加密后的密文
	 * @throws Exception
	 */
	public static String encryptDES(String encryptString) throws Exception {
        IvParameterSpec zeroIv = new IvParameterSpec(iv);
        SecretKeySpec key = new SecretKeySpec(k.getBytes(), "DES");
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        cipher.init(Cipher.ENCRYPT_MODE, key, zeroIv);
        byte[] encryptedData = cipher.doFinal(encryptString.getBytes("UTF-8"));
        return Base64.encode(encryptedData);
	 }

	/**
	 * DES解密
	 * @param decryptString 待解密的数据
	 * @param decryptKey 密钥
	 * @return 解密后的明文
	 * @throws Exception
	 */
	public static String decryptDES(String decryptString)throws Exception {
		byte[] byteMi = Base64.decode(decryptString);
		IvParameterSpec zeroIv = new IvParameterSpec(iv);
		SecretKeySpec key = new SecretKeySpec(k.getBytes(), "DES");
		Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
		cipher.init(Cipher.DECRYPT_MODE, key, zeroIv);
		byte decryptedData[] = cipher.doFinal(byteMi);
		return new String(decryptedData,"utf-8");
	}
	
	
	
	/**
	 * 特殊字符转换
	 * @param params
	 * @return
	 */
	public static String changeSpecialCode(String params) {
		// TODO Auto-generated method stub
		return params.replaceAll("%2B", "+").replaceAll("%3D", "=").replaceAll("%2F", "/").replaceAll("%2b", "+").replaceAll("%3d", "=").replaceAll("%2f", "/");
	}

	/**
	 * 加密替换
	 * @param params
	 * @return
	 */
	private static  String nchangeSpecialCode(String params) {
		return params.replaceAll("\\+", "%2B").replaceAll("=", "%3D").replaceAll("/", "%2F");
	}
	
	
	public static void main(String[] args) {
//		Map<String, Object> resultMap = new HashMap<String, Object>();
//		resultMap.put("aaa", "  中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文中文。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。");
//		resultMap.put("bbbbbbbbbbbbbbbbb", "★ 最佳良药\n一位著名的医生同熟人聊天时说：“我给人治病已经有30年了。在这期间，我给他们开过各式各样的处方，然而最终我得出结论：医治人们各种疾病的最佳良药是爱情。”\n　　“要是这也不奏效呢？”\n　　“那就把剂量加大一倍。”医生回答。\n");
//		System.out.println(JsonUtil.createJsonString(resultMap));
//		try {
//			String encryptDES = DESCoder.encryptDES(JsonUtil.createJsonString(resultMap));
//			System.out.println("加密后："+encryptDES);
//			System.out.println("解密后："+DESCoder.decryptDES(encryptDES));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		String string = "avr5byfpj+VnUZo+LiPlmClAh2cqEsZtWWxxSTRanRvLtnRNXEMJG6Kazw/o TIj9LYDFq7S+IZHid0ggqEz5tCFs9/rDMCfIkcHuXD12nlAeQky0XOtAwGCU PZrQuE0qC/HG4/1nohl7aHyZQBf1TSJEE9db8fao/XY4PpRC/rybj/N8x8IL T4tmwpXLsgcdn7GiI34dBaEThsmh/hpGX2HKfxLIftX2ORTcvHTTQFTO0SEW mESYSS3X8exLpe5V8VEU7/cA0vMV7s/4zBCaWQ==";
		String en="f8873011ca2831adfbabdceb1ba3ffca2e453bbff34d49579f3efad2d0b6b69aea70a70d0ec97b9401a3f5ea84c056019a17e647d4a06ef0b479dfebc67e1e6528a8be6e252fd9f7ea2640f8328518ef07e80e07e19da8a46a65dcf068a64b191a1fb44203008a59bcbc8a8fb0d21cbe";
		String x="{\"departold\":\"/有限公司/研发部\",\"password\":\"233007\",\"userphone\":\"18523876564\"}";
		
		
		String xx="0NO1MLx2pQ4JdhHScOdjUmuoIAeCffyzJKu+ZLRvgYWBkgquEa8qd1f8xDCz P6OxbA1NZ5CQeZSeUSfk3yM3meq3JGeWcpqUdJyDcncAvpg=";
		try {
	//		 result2 = new String(DESCoder.encryptDES(xx));
		
			String	result2=DESCoder.decryptDES(xx);
			System.out.println("result:"+result2);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
//		try {
//			String result = new String(DESCoder.decryptDES(string));
//			System.out.println("result:"+result);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
}

package org.example;

import java.security.*;
import java.security.spec.NamedParameterSpec;

public class GenerateKeyPairs {
    public static void main(String[] args) throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        KeyPairGenerator kpg=KeyPairGenerator.getInstance("XDH");
        NamedParameterSpec parameterSpec=new NamedParameterSpec("X25519");
        kpg.initialize(parameterSpec);
        KeyPair keyPair=kpg.generateKeyPair();
        System.out.println("---public key---");
        PublicKey publicKey=keyPair.getPublic();
        System.out.println(publicKey.getAlgorithm());
        System.out.println(publicKey.getFormat());
        byte[]pubKey=publicKey.getEncoded();
        System.out.println("------------");
        System.out.println("----private key----");
        PrivateKey privateKey=keyPair.getPrivate();
        System.out.println(publicKey.getAlgorithm());
        System.out.println(publicKey.getFormat());
        byte[]priKey=privateKey.getEncoded();
    }
}

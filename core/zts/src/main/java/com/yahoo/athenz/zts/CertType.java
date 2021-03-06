//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zts;
import com.yahoo.rdl.*;

//
// CertType - CertType denotes various types of certs issued by Athenz
//
public enum CertType {
    X509,
    SSH_HOST,
    SSH_USER;

    public static CertType fromString(String v) {
        for (CertType e : values()) {
            if (e.toString().equals(v)) {
                return e;
            }
        }
        throw new IllegalArgumentException("Invalid string representation for CertType: " + v);
    }
}

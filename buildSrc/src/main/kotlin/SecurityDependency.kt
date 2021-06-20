object SecurityVersions {
    const val ROOT_BEER = "0.1.0"
    const val SECURITY_CRYPTO = " 1.1.0-alpha03"
}

object SecurityDependency {
    const val ROOT_BEER = "com.scottyab:rootbeer-lib:${SecurityVersions.ROOT_BEER}"
    const val SECURITY_CRYPTO = "androidx.security:security-crypto:${SecurityVersions.SECURITY_CRYPTO}"
}

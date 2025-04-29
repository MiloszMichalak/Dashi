package com.menene.dashi.auth

import com.menene.dashi.util.Error

enum class FirebaseError: Error {
    INVALID_CREDENTIALS,
    EMAIL_ALREADY_IN_USE,
    SERVER_ERROR,
    TOO_MANY_REQUESTS,
    WEAK_PASSWORD,
    WRONG_PASSWORD,
    NETWORK_ERROR,
    UNKNOWN_ERROR,
}
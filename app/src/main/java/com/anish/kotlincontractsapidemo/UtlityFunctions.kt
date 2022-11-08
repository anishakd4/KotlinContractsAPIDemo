package com.anish.kotlincontractsapidemo

import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract


//older version
//val Any?.isNull: Boolean get() = this == null
//val Any?.isNotNull: Boolean get() = !this.isNull
//val Any?.isNullOrEmpty: Boolean
//    get() =
//        when (this) {
//            null -> true
//            is Collection<*> -> this.isEmpty()
//            is CharSequence -> this.isEmpty()
//            else -> false
//        }
//
//val Any?.isNotNullOrEmpty: Boolean get() = !this.isNullOrEmpty


//updated versions
@OptIn(ExperimentalContracts::class)
fun Any?.isNull(): Boolean {
    contract {
        returns(false) implies (this@isNull != null)
    }
    return this == null
}

@OptIn(ExperimentalContracts::class)
fun Any?.isNullOrEmpty(): Boolean {
    contract {
        returns(false) implies (this@isNullOrEmpty != null)
    }
    return when (this) {
        null -> true
        is Collection<*> -> this.isEmpty()
        is CharSequence -> this.isEmpty()
        else -> false
    }
}

@OptIn(ExperimentalContracts::class)
fun Any?.isNotNullOrEmpty(): Boolean {
    contract {
        returns(true) implies (this@isNotNullOrEmpty != null)
    }
    return !this.isNullOrEmpty()
}
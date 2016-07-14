package com.grailsinaction

class User {

    String loginId
    String password
    Date dateCreated

    static  hasOne = [profile: Profile]
    static  hasMany = [posts: Post]

    static constraints = {
        loginId size: 3..20, unique: true, nullable: false
        password size: 6..8, nullable: false, validator: {passwd, user -> passwd != user.loginId}
        homepage url: true, nullable: true
        profile nullable: true
    }
}

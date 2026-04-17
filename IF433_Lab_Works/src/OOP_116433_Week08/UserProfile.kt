package OOP_116433_Week08

//name adalah Non-Null (wajib), email dan Nullable (opsional)

class UserProfile (
    val name: String,
    val email: String?,
    val phone: String? = null // Default argument null
)

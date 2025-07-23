
let otp = "";
function otpGenerator(len){
    try{
    for (let i = 0; i < len; i++) {
        otp += Math.floor(Math.random() * 10);
    }
    return otp;
}catch (error) {
    throw error;
}
}

function otpVerify(otp){
    try{
        if (otp!=userOtp) {
            return false;
        } else {
            return true;
        }
    } catch (error) {
        throw error;
    }
}

module.exports = {
    otpGenerator,
    otpVerify
};

/**
 * Created by SHADMAN on 17-Mar-16.
 */
function add(a,b) {
    if (typeof a === "number" && typeof b === "number")
        return a + b;
    else if (typeof parseInt(a) == "number" && typeof parseInt(b) == "number") {

        return parseInt(a) + parseInt(b);
    }
    else if (typeof a === "number" && typeof b === "string")
        return a + parseInt(b);
    else if (typeof a === "string" && typeof b === "number")
        return parseInt(a) + b;
    if (typeof a === "string" && typeof b === "string") {
        if (isNaN(parseInt(a)) && isNaN(parseInt(b))) {
            return 0;
        }
    }
}
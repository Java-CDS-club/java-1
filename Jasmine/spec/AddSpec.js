/**
 * Created by SHADMAN on 17-Mar-16.
 */


describe("AddTestSuite",function(){
    //TestSuite defined

/*
    it("Should add two numbers",function(){  //Test Case defined
        var result=add(10,20);
        expect(result).toBe(30);

    });  //Test Case close

    it("Should add two String numbers",function(){
        var result=add("10","20");
        expect(result).toBe(30);
    });  //Test Case close

it("Should add one String number and one number",function(){
    var result=add("10",20);
    expect(result).toBe(30);
});  //Test Case close

it("Should add one number and one string number",function(){
    var result=add(10,"20");
    expect(result).toBe(30);
});  //Test Case close
*/

it("Should add two Strings",function(){
    var result=add("ten","twenty");
    expect(result).toBe(0);
}); //Test Case close

});       //Test Suite close




//doubt in expect() function and describe() function and it() function
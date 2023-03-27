//timer
timeLeft = 60;
timerbool = true;

function countdown() {
	if(timerbool == true){
		timeLeft--;
		document.getElementById("countdown").innerHTML = String( timeLeft + " seconds remaining" );

		if (timeLeft > 0) {
			setTimeout(countdown, 1000);
		}
		else if(timeLeft == 0) {
			alert("Time is over");
			submitfun();
		}
		else{
			return;
		}
	}
	

};

//marks cal
function getRadioValue() {

	//Get the radio buttons inputs
	var q1=document.quiz.question1.value;
	var q2=document.quiz.question2.value;
	var q3=document.quiz.question3.value;
	var q4=document.quiz.question4.value;
	var q5=document.quiz.question5.value;
	var q6=document.quiz.question6.value;
	var q7=document.quiz.question7.value;
	var q8=document.quiz.question8.value;
	var q9=document.quiz.question9.value;
	var q10=document.quiz.question10.value;

	//Use a control structure to check whether the user has answered all the questions
	if(q1=="" || q2=="" || q3=="" || q4=="" || q5=="" || q6=="" || q7=="" || q8=="" || q9=="" || q10==""){
		alert("Please answer all the questions");
	}
	else{ 	
		submitfun();
		
	}
	}

	//submit function
	function submitfun(){

		timerbool = false;
		var mark=0;

		//Get the radio buttons answers
		var q1=document.quiz.question1.value;
		var q2=document.quiz.question2.value;
		var q3=document.quiz.question3.value;
		var q4=document.quiz.question4.value;
		var q5=document.quiz.question5.value;
		var q6=document.quiz.question6.value;
		var q7=document.quiz.question7.value;
		var q8=document.quiz.question8.value;
		var q9=document.quiz.question9.value;
		var q10=document.quiz.question10.value;

		//Use control structures to validate the answers and add or remove marks and make the color changes
			if (q1=="Sri Jayawardanapura Kotte") {
				mark=mark+2;
				var q1div =	document.getElementById("q1");
				q1div.style.backgroundColor  = "#B2D3C2";
				document.getElementById("result1").innerHTML = String("Your answer is correct");
			}
			else {
				mark=mark-1;
				var q1div =	document.getElementById("q1");
				q1div.style.backgroundColor  = "#BC544B";
				document.getElementById("result1").innerHTML = String("Your answer is incorrect </br> The correct answer is Sri Jayawardanapura Kotte");
			}

			if (q2=="Sigiriya") {
				mark=mark+2;
				var q2div =	document.getElementById("q2");
				q2div.style.backgroundColor  = "#B2D3C2";
				document.getElementById("result2").innerHTML = String("Your answer is correct");
			}
			else {
				mark=mark-1;
				var q2div =	document.getElementById("q2");
				q2div.style.backgroundColor  = "#BC544B";
				document.getElementById("result2").innerHTML = String("Your answer is incorrect </br> The correct answer is Sigiriya");
			}

			if (q3=="Rome") {
				mark=mark+2;
				var q3div =	document.getElementById("q3");
				q3div.style.backgroundColor  = "#B2D3C2";
				document.getElementById("result3").innerHTML = String("Your answer is correct");
			}
			else {
				mark=mark-1;
				var q3div =	document.getElementById("q3");
				q3div.style.backgroundColor  = "#BC544B";
				document.getElementById("result3").innerHTML = String("Your answer is incorrect </br> The correct answer is Rome");
			}

			if (q4=="Paris") {
				mark=mark+2;
				var q4div =	document.getElementById("q4");
				q4div.style.backgroundColor  = "#B2D3C2";
				document.getElementById("result4").innerHTML = String("Your answer is correct");
			}
			else {
				mark=mark-1;
				var q4div =	document.getElementById("q4");
				q4div.style.backgroundColor  = "#BC544B";
				document.getElementById("result4").innerHTML = String("Your answer is incorrect </br> The correct answer is Paris");
			}

			if (q5=="9") {
				mark=mark+2;
				var q5div =	document.getElementById("q5");
				q5div.style.backgroundColor  = "#B2D3C2";
				document.getElementById("result5").innerHTML = String("Your answer is correct");

			}
			else {
				mark=mark-1;
				var q5div =	document.getElementById("q5");
				q5div.style.backgroundColor  = "#BC544B";
				document.getElementById("result5").innerHTML = String("Your answer is incorrect </br> The correct answer is 9");
			}

			if (q6=="France") {
				mark=mark+2;
				var q6div =	document.getElementById("q6");
				q6div.style.backgroundColor  = "#B2D3C2";
				document.getElementById("result6").innerHTML = String("Your answer is correct");
			}
			else {
				mark=mark-1;
				var q6div =	document.getElementById("q6");
				q6div.style.backgroundColor  = "#BC544B";
				document.getElementById("result6").innerHTML = String("Your answer is incorrect </br> The correct answer is France");
			}

			if (q7=="Pyramids of Giza") {
				mark=mark+2;
				var q7div =	document.getElementById("q7");
				q7div.style.backgroundColor  = "#B2D3C2";
				document.getElementById("result7").innerHTML = String("Your answer is correct");
			}
			else {
				mark=mark-1;
				var q7div =	document.getElementById("q7");
				q7div.style.backgroundColor  = "#BC544B";
				document.getElementById("result7").innerHTML = String("Your answer is incorrect </br> The correct answer is Pyramids of Giza");
			}

			if (q8=="Burj Khalifa") {
				mark=mark+2;
				var q8div =	document.getElementById("q8");
				q8div.style.backgroundColor  = "#B2D3C2";
				document.getElementById("result8").innerHTML = String("Your answer is correct");
			}
			else {
				mark=mark-1;
				var q8div =	document.getElementById("q8");
				q8div.style.backgroundColor  = "#BC544B";
				document.getElementById("result8").innerHTML = String("Your answer is incorrect </br> The correct answer is Burj Khalifa - Dubai");
			}

			if (q9=="10256 km") {
				mark=mark+2;
				var q9div =	document.getElementById("q9");
				q9div.style.backgroundColor  = "#B2D3C2";
				document.getElementById("result9").innerHTML = String("Your answer is correct");
			}
			else {
				mark=mark-1;
				var q9div =	document.getElementById("q9");
				q9div.style.backgroundColor  = "#BC544B";
				document.getElementById("result9").innerHTML = String("Your answer is incorrect </br> The correct answer is 10256 km");
			}

			if (q10=="Brazil") {
				mark=mark+2;
				var q10div =	document.getElementById("q10");
				q10div.style.backgroundColor  = "#B2D3C2";
				document.getElementById("result10").innerHTML = String("Your answer is correct");
			}
			else {
				mark=mark-1;
				var q10div =	document.getElementById("q10");
				q10div.style.backgroundColor  = "#BC544B";
				document.getElementById("result10").innerHTML = String("Your answer is incorrect </br> The correct answer is Brazil");
			}

			//Display the marks
			document.getElementById("marks").innerHTML = String( "Total marks : "+ mark);
			
			//Hide the timer
			var countdown =	document.getElementById("countdown");
			countdown.style.display = "none";

			//Calculate the time spent
			timespent = 60-timeLeft;

			//Display the time spent
			document.getElementById("countdownleft").innerHTML = String("Total time to finish : " + timespent + " seconds");
			var countdownleft =	document.getElementById("countdownleft");
			countdownleft.style.display = "block";

			//disable the form input after submission
			document.getElementById("formcontrol").setAttribute("disabled","disabled");

			//Scroll back to top after submission
			document.documentElement.scrollTop = 0;

			//Hide the submit button
			var submitbtn =	document.getElementById("submitbtn");
			submitbtn.style.display = "none";

		
	}

// show/hide form
function StartFun() {
	var quiz =	document.getElementById("quiz");
	var strbtn =document.getElementById("strbtn");

	quiz.style.display = "block";
	strbtn.style.display = "none";
  }

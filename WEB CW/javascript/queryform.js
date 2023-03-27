function submitForm() {
        let name = document.forms["data_form"]["name"].value;
        let email = document.forms["data_form"]["email"].value;
        let subjects = document.forms["data_form"]["subjects"].value;
        let details = document.forms["data_form"]["details"].value;

        if (name == "") {
            alert(" Name must be filled out.");
            return false;
        } else if (email == "") {
            alert("Email must be filled out.");
            return false;
        } else if (subjects == "--Choose a subject") {
            alert("Please choose a subject.");
            return false;
        } else if (details == "") {
            alert("Details must be filled out");
            return false;
        } else {

            // alert("Validated");
            document.getElementById("queryform").style.display = "block";
            document.getElementById("data_form").style.display = "none";
            document.getElementById("result").style.display = "block";

            document.getElementById("result_name").innerHTML = name;
            document.getElementById("result_email").innerHTML = email;
            document.getElementById("result_subjects").innerHTML = subjects;
            document.getElementById("result_details").innerHTML = details;

            document.getElementById("name1").value = name;
            document.getElementById("email1").value = email;
            document.getElementById("subject1").value = subjects;
            document.getElementById("details1").value = details;
            return false;
        }
    }

    function toggleForm() {
        document.getElementById("data_form").style.display = "block";
        document.getElementById("result").style.display = "none";
    }

    function sendEmaill(){
        document.getElementById("data_form").style.display = "block";
    }



    
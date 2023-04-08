<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        body {
            margin: 0 auto;
            width: 280px;
        }

        .container {
            padding:10px;
            border: 1px solid;
        }
        .header {
            height: 40px;
        }

        .row {
            height: 30px;
        }

        .title {
            width: 70px;
            float: left;
            font-weight: bold;
        }

        .input {
            float: left;
        }

        input[type='submit'] {
            font-weight: bold;
            width:120px;
            background-color: lightgrey;
        }
    </style>
</head>
<body>
    <center>
        <form action="./accreg" method="post">
            <div class="header">
                <h3>계  좌</h3>
            </div>
            <div class="container">
                <div class="row">
                    <div class="title">계좌번호</div>
                    <div class="input"><input type="text" name="id" id='id'></div>
                </div>
                <div class="row">
                    <div class="title">이름</div>
                    <div class="input"><input type="text" name="name" id='name'></div>
                </div>
                <div class="row">
                    <div class="title">입금액</div>
                    <div class="input"><input type="text" name="money" id='money'></div>
                </div>
                <div class="button">
                    <input id="makeBtn" type="submit" value="등록"/>
                </div>
            </div>
        </form>
    </center>
    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
    <script src="account.js"></script>
    <script>
        $('input[type="radio"]').change(function() {
            let type = $('input[type="radio"]:checked').val();
            if(type=='special') {
                $('select').attr('disabled',false);
            } else {
                $('select').attr('disabled',true);
            }
        });
        
        $('#makeBtn').click(function() {
            //1. 사용자가 입력한 값(계좌번호, 이름, 입금액, 등급)을 엘리먼트로부터 가져와 Account 객체를 만든다.
            let id = +$('#id').val();
            let name = $('#name').val();
            let money = +$('#money').val();
            let level = null;
            let type = $('input[type="radio"]:checked').val();
            if(type=='special') level = $('#grade').val();
            let acc = new Account(id,name,money,level);
            //2. Account 객체를 JSON string 으로 변환한다.
            let accstr = JSON.stringify(acc);
            alert(accstr)
        });
    </script>    
</body>
</html>
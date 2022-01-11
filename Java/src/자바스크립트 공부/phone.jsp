<%@ page import="java.util.List" %>
<%@ page import="java.util.Map" %>
<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%
    String user_name = (String) request.getAttribute("user_name");
    List<Map<String, Object>> rList = (List<Map<String, Object>>) request.getAttribute("userPhoneList");
%>

<html>
<head>

    <%@include file="/WEB-INF/view/inc/Commheader.jsp" %>
    <style>

        .table td {
            font-size: 20px;
        }
    </style>
</head>

<body>
<div class="container-scroller">
    <%@include file="/WEB-INF/view/inc/navAdmin.jsp" %>
    <!-- partial -->
    <div class="container-fluid page-body-wrapper">
        <!-- partial:partials/_navbar.html -->
        <%@include file="/WEB-INF/view/inc/navSecond.jsp" %>
        <!-- partial -->
        <div class="main-panel">
            <div class="content-wrapper">
                <div class="card" style="margin-bottom: 30px;">
                    <div class="card-body">
                        <h4 class="card-title" style="font-size: 30px;">전화번호부</h4>
                        <p></p>
                        <div class="table-responsive">
                            <table class="table table-hover">
                                <thead>
                                <tr>
                                    <td class="py-1">
                                        <img src="assets/images/faces-clipart/pic-1.png" alt="image">
                                    </td>
                                    <td><%=user_name%>
                                    </td>
                                    <td></td>
                                    <td><a href="phoneNumber.do" onclick="create()">전화번호추가</a></td>
                                </tr>
                                </thead>
                            </table>
                        </div>
                    </div>
                </div>
                <div class="card">
                    <div class="card-body">
                        <p></p>
                        <div class="table-responsive">
                            <table class="table table-hover">
                                <thead>
                                <tr>
                                    <th></th>
                                    <th>Name</th>
                                    <th>PhonNumber</th>
                                    <th></th>
                                </tr>
                                </thead>
                                <tbody>
                                <% for (Map<String, Object> pMap : rList) { %>
                                <tr id="total">
                                    <td class="py-1">
                                        <img src="assets/images/faces-clipart/pic-1.png" alt="image">
                                    </td>
                                    <td><%=pMap.get("Name")%>
                                    </td>
                                    <td><%=pMap.get("Number")%>
                                    </td>
                                    <td><a  href="phoneNumber.do" onclick="phoneUpdate('<%=pMap.get("num")%>')">수정</a> &nbsp&nbsp &nbsp &nbsp &nbsp<a  href="phoneNumber.do" onclick="phonedelete('<%=pMap.get("num")%>')" >삭제</a></td>
                                </tr>
                                <% }%>

                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>

            <!--화면 분할하기-->
            <!-- content-wrapper ends -->
            <!-- partial:partials/_footer.html -->
            <%@include file="/WEB-INF/view/inc/Commfooter.jsp" %>

</body>
<script src="/js/jquery-3.4.1.min.js"></script>
<script>
    //번호추가하기
    function create() {
            let Name = prompt("이름을 입력하세요.");
            let Number = prompt("전화번호를 입력하세요");
            var data = {"Name": Name, "Number": Number};
            $.ajax({
                url: '/insertPhoneNumber.do',
                type: "post",
                data: data,
                success: function () {
                    alert("데이터전송 성공");
                    location.reload(); //다시페이지 reload 해줌
                },
                error: function (error) {
                    alert("에러");
                }

            })
        }

    function phonedelete(number) {
        console.log(number);
        let num = number;
        $.ajax({
            url: '/deletePhoneNumber.do',
            type: "post",
            data: {"num":num},
            success: function () {
                alert("삭제완료");
                location.reload(); //다시페이지 reload 해줌
            },
            error: function (error) {
                alert("에러");
            }

        })


    }

    function phoneUpdate(number) {
        let Name = prompt("이름을 입력하세요.");
        let Number = prompt("전화번호를 입력하세요");
        let num= number;
        console.log(num);
        $.ajax({
            url: '/updatePhoneNumber.do',
            type: "post",
            data: {"num":num,"Name":Name,"Number":Number},
            success: function () {
                alert("수정 완료");
                location.reload(); //다시페이지 reload 해줌
            },
            error: function (error) {
                alert("에러");
            }

        })


    }


</script>

</html>
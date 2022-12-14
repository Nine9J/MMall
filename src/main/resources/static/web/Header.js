document.write("<!DOCTYPE html>");
document.write("<html lang=\"en\">");
document.write("<head>");
document.write("    <meta charset=\"UTF-8\">");
document.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">");
document.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
document.write("    <!-- 引入css -->");
document.write("    <link rel=\"stylesheet\" href=\"..\/css\/Header.css\">");
document.write("    <!--导入jquery-->");
document.write("    <script src=\"http:\/\/code.jquery.com\/jquery-latest.js\"><\/script>");
document.write("    <title>导航栏<\/title>");
document.write("<\/head>");
document.write("<body>");
document.write("    <div class=\"container\">");
document.write("        <nav>");
document.write("            <a href=\"\/web\/Home.html\">首页<\/a>");
document.write("            <a href=\"\/web\/Cart.html\" id=\"Cart\">购物车<\/a>");
document.write("            <a href=\"\/web\/Orders.html\">订单<\/a>");
document.write("            <a href=\"\/web\/User.html\" id=\"myUser\">用户<\/a>");
document.write("            <div class=\"animation\"><\/div>");
document.write("            <div class=\"info-box\">");
document.write("                <p id=\"username-info\" class=\"info\">用户名:<\/p>");
document.write("                <p id=\"type\" class=\"info\">登录类型:<\/p>");
document.write("            <\/div>");
document.write("        <\/nav>");
document.write("        <div id=\"back-color\" class=\"back-color\">");
document.write("            <span class=\"spring\" onclick=\"color1()\"><\/span>");
document.write("            <span class=\"summer\" onclick=\"color2()\"><\/span>");
document.write("            <span class=\"autumn\" onclick=\"color3()\"><\/span>");
document.write("            <span class=\"winter\" onclick=\"color4()\"><\/span>");
document.write("        <\/div>");
document.write("    <\/div>");
document.write("");
document.write("    <script type=\"text\/javascript\">");
document.write("        $.ajax({");
document.write("            url: \"\/users\/get_by_uid\",");
document.write("            type: \"GET\",");
document.write("            data: \"\",");
document.write("            dataType: \"JSON\",");
document.write("            success: function (json) {");
document.write("                if(json.state == 5004) {");
document.write("                    alert(\"uid不存在\");");
document.write("                }else {");
document.write("                    $(\"#username-info\").text(\"用户名:   \"+json.data.username);");
document.write("                    if(json.data.isAdmin == 1){");
document.write("                        $(\"#type\").text(\"登陆类型:   管理员\");");
document.write("                        $('#myUser').attr('href','\/web\/Management.html');");
document.write("                        $('#myUser').text(\"管理员\");");
document.write("                    }else {");
document.write("                        $(\"#type\").text(\"登陆类型:   用户\");");
document.write("                    }");
document.write("                }");
document.write("            },");
document.write("            error: function (xhr) {");
document.write("            }");
document.write("        })");
document.write("    <\/script>");
document.write("<\/body>");
document.write("<\/html>");

/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-06-22 09:42:40 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.asd.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  public java.lang.String getServletInfo() {
    return "";
  }

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write(" \r\n");
      out.write("		\r\n");
      out.write("		<div class=\"header\">\r\n");
      out.write("			<!-- 서비스 메뉴 -->\r\n");
      out.write("\r\n");
      out.write("			<div class=\"header_content\">\r\n");
      out.write("				<div class=\"contents\">\r\n");
      out.write("					<h1 onclick=\"\">\r\n");
      out.write("						<a href=\"index.jsp\"><img\r\n");
      out.write("							src=\"../logo.png\"\r\n");
      out.write("							alt=\"CGV\" /></a><span style=\"font-weight: bold;\">CULTUREPLEX</span>\r\n");
      out.write("					</h1>\r\n");
      out.write("					<ul class=\"memberInfo_wrap\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("						");

						String id="";
						
						if (session.getAttribute("id") != null) {
							id = session.getAttribute("id").toString();
						}
						
      out.write("\r\n");
      out.write("						\r\n");
      out.write("						<li>\r\n");
      out.write("						\r\n");
      out.write("						");
 if( id.equals("")){ 
      out.write("\r\n");
      out.write("						\r\n");
      out.write("						<a href=\"login.jsp\">\r\n");
      out.write("							<img src=\"https://img.cgv.co.kr/R2014/images/common/ico/loginPassword.png\" alt=\"로그인\" />\r\n");
      out.write("							<span>로그인</span></a></li>\r\n");
      out.write("							\r\n");
      out.write("						<li><a href=\"join.jsp\"><img\r\n");
      out.write("								src=\"https://img.cgv.co.kr/R2014/images/common/ico/loginJoin.png\"\r\n");
      out.write("								alt=\"회원가입\" /><span>회원가입</span></a></li>\r\n");
      out.write("							\r\n");
      out.write("							\r\n");
      out.write("							");
}else{ 
      out.write("\r\n");
      out.write("							\r\n");
      out.write("						<li><a href=\"logout.jsp\" class=\"logout\" title=\"로그아웃\" >\r\n");
      out.write("							<img src=\"https://img.cgv.co.kr/R2014/images/common/ico/loginPassword.png\" alt=\"로그아웃\" />\r\n");
      out.write("							<span>로그아웃</span></a></li>\r\n");
      out.write("							");
 } 
      out.write("\r\n");
      out.write("								\r\n");
      out.write("								\r\n");
      out.write("\r\n");
      out.write("						<li><a href=\"myPage.jsp\"><img\r\n");
      out.write("								src=\"https://img.cgv.co.kr/R2014/images/common/ico/loginMember.png\"\r\n");
      out.write("								alt=\"MY CGV\" /><span>MY 명화관</span></a></li>\r\n");
      out.write("					</ul>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			<script>\r\n");
      out.write("				//GA Analytics TopMenu 영역 LOG\r\n");
      out.write("				//빨강 CGV클릭\r\n");
      out.write("				$('.header_content > .contents > h1 > a').on({\r\n");
      out.write("					click : function(e) {\r\n");
      out.write("						gaEventLog('PC_GNB', '홈', '');\r\n");
      out.write("					}\r\n");
      out.write("				});\r\n");
      out.write("				//서비스 메뉴\r\n");
      out.write("				$('.header_content > .contents > ul > li > a').on({\r\n");
      out.write("					click : function(e) {\r\n");
      out.write("						gaEventLog('PC_GNB', '서비스메뉴_' + this.text, '');\r\n");
      out.write("					}\r\n");
      out.write("				});\r\n");
      out.write("			</script>\r\n");
      out.write("			<!-- 서비스 메뉴 -->\r\n");
      out.write("\r\n");
      out.write("			<!-- 서브 메뉴 -->\r\n");
      out.write("\r\n");
      out.write("			<script type=\"text/javascript\">\r\n");
      out.write("				$(document)\r\n");
      out.write("						.ready(\r\n");
      out.write("								function() {\r\n");
      out.write("									$('.nav_menu > li > h2 > a').on({mouseenter : function(e) {\r\n");
      out.write("										var target = e.target;\r\n");
      out.write("										$(target).parents('.nav_menu').find('.nav_overMenu').slideDown(function() {\r\n");
      out.write("											$('.nav').addClass('active');});\r\n");
      out.write("									},\r\n");
      out.write("										click : function(e) {\r\n");
      out.write("											var target = e.target;\r\n");
      out.write("											if (!$('.nav').hasClass('active')) {\r\n");
      out.write("												$(this).trigger('mouseenter');\r\n");
      out.write("											} else {\r\n");
      out.write("												$('.nav').trigger('mouseleave');}\r\n");
      out.write("										}\r\n");
      out.write("									});\r\n");
      out.write("\r\n");
      out.write("									/********************************************************\r\n");
      out.write("									//서브메뉴 구글 GA Analytics 로그 처리 - 2022.01.12 myilsan\r\n");
      out.write("									 ********************************************************/\r\n");
      out.write("									//cgv화이트 메뉴클릭\r\n");
      out.write("									$('.nav > .contents > h1 > a').on({\r\n");
      out.write("										click : function(e) {\r\n");
      out.write("											gaEventLog('PC_GNB', '홈', '');\r\n");
      out.write("										}\r\n");
      out.write("									});\r\n");
      out.write("\r\n");
      out.write("									//주메뉴 클릭\r\n");
      out.write("									$('.nav_menu > li > h2 > a').on(\r\n");
      out.write("											{\r\n");
      out.write("												click : function(e) {\r\n");
      out.write("													gaEventLog('PC_GNB', '주메뉴_'\r\n");
      out.write("															+ this.text, '');\r\n");
      out.write("												}\r\n");
      out.write("											});\r\n");
      out.write("\r\n");
      out.write("									//주메뉴 하위메뉴 클릭\r\n");
      out.write("									$('.nav_overMenu > dd > h3 > a')\r\n");
      out.write("											.on(\r\n");
      out.write("													{\r\n");
      out.write("														click : function(e) {\r\n");
      out.write("															var target = e.target;\r\n");
      out.write("															var parText = $(\r\n");
      out.write("																	target)\r\n");
      out.write("																	.parents(\r\n");
      out.write("																			'.nav_overMenu')\r\n");
      out.write("																	.find('dt')[0].innerText;\r\n");
      out.write("															gaEventLog(\r\n");
      out.write("																	'PC_GNB',\r\n");
      out.write("																	parText\r\n");
      out.write("																			+ '_'\r\n");
      out.write("																			+ this.text,\r\n");
      out.write("																	'');\r\n");
      out.write("														}\r\n");
      out.write("													});\r\n");
      out.write("\r\n");
      out.write("									//하위메뉴 최상위 클릭\r\n");
      out.write("									$(\".nav_overMenu > dt > h2 > a\")\r\n");
      out.write("											.on(\r\n");
      out.write("													{\r\n");
      out.write("														click : function(e) {\r\n");
      out.write("															gaEventLog(\r\n");
      out.write("																	'PC_GNB',\r\n");
      out.write("																	this.text\r\n");
      out.write("																			+ '_'\r\n");
      out.write("																			+ this.text,\r\n");
      out.write("																	'');\r\n");
      out.write("														}\r\n");
      out.write("													});\r\n");
      out.write("\r\n");
      out.write("									//------------------end----------------------- [@,.o]>\r\n");
      out.write("\r\n");
      out.write("									$('.nav')\r\n");
      out.write("											.on(\r\n");
      out.write("													{\r\n");
      out.write("														mouseleave : function(e) {\r\n");
      out.write("															$(this)\r\n");
      out.write("																	.find(\r\n");
      out.write("																			'.nav_overMenu')\r\n");
      out.write("																	.slideUp(\r\n");
      out.write("																			200,\r\n");
      out.write("																			function() {\r\n");
      out.write("																				$(\r\n");
      out.write("																						'.nav')\r\n");
      out.write("																						.removeClass(\r\n");
      out.write("																								'active');\r\n");
      out.write("																			});\r\n");
      out.write("														}\r\n");
      out.write("													});\r\n");
      out.write("\r\n");
      out.write("									$(this)\r\n");
      out.write("											.on(\r\n");
      out.write("													{\r\n");
      out.write("														scroll : function(e) {\r\n");
      out.write("															/* S GNB fixed */\r\n");
      out.write("															var headerOffsetT = $(\r\n");
      out.write("																	'.header')\r\n");
      out.write("																	.offset().top;\r\n");
      out.write("															var headerOuterH = $(\r\n");
      out.write("																	'.header')\r\n");
      out.write("																	.outerHeight(\r\n");
      out.write("																			true);\r\n");
      out.write("															var fixedHeaderPosY = headerOffsetT\r\n");
      out.write("																	+ headerOuterH;\r\n");
      out.write("															var scrollT = $(\r\n");
      out.write("																	this)\r\n");
      out.write("																	.scrollTop();\r\n");
      out.write("															var scrollL = $(\r\n");
      out.write("																	this)\r\n");
      out.write("																	.scrollLeft();\r\n");
      out.write("\r\n");
      out.write("															if (scrollT >= fixedHeaderPosY) {\r\n");
      out.write("																$('.nav')\r\n");
      out.write("																		.addClass(\r\n");
      out.write("																				'fixed');\r\n");
      out.write("																$(\r\n");
      out.write("																		'.fixedBtn_wrap')\r\n");
      out.write("																		.addClass(\r\n");
      out.write("																				'topBtn');\r\n");
      out.write("															} else {\r\n");
      out.write("																$('.nav')\r\n");
      out.write("																		.removeClass(\r\n");
      out.write("																				'fixed');\r\n");
      out.write("																$(\r\n");
      out.write("																		'.fixedBtn_wrap')\r\n");
      out.write("																		.removeClass(\r\n");
      out.write("																				'topBtn');\r\n");
      out.write("															}\r\n");
      out.write("\r\n");
      out.write("															/* S > GNB fixed 좌우 스크롤\r\n");
      out.write("															Description\r\n");
      out.write("															- GNB가 fixed 되었을때 좌우 스크롤 되게 처리\r\n");
      out.write("															 */\r\n");
      out.write("															if ($('.nav')\r\n");
      out.write("																	.hasClass(\r\n");
      out.write("																			'fixed')) {\r\n");
      out.write("																$('.nav')\r\n");
      out.write("																		.css(\r\n");
      out.write("																				{\r\n");
      out.write("																					'left' : -1\r\n");
      out.write("																							* scrollL\r\n");
      out.write("																				})\r\n");
      out.write("															} else {\r\n");
      out.write("																$('.nav').css({\r\n");
      out.write("																	'left' : 0\r\n");
      out.write("																})\r\n");
      out.write("															}\r\n");
      out.write("															/* E > GNB fixed 좌우 스크롤 */\r\n");
      out.write("															/* S GNB fixed */\r\n");
      out.write("														}\r\n");
      out.write("													});\r\n");
      out.write("\r\n");
      out.write("									$('.btn_gotoTop').on({\r\n");
      out.write("										click : function() {\r\n");
      out.write("											$('html, body').stop().animate({\r\n");
      out.write("												scrollTop : '0'\r\n");
      out.write("											}, 400);\r\n");
      out.write("										}\r\n");
      out.write("									});\r\n");
      out.write("\r\n");
      out.write("								});\r\n");
      out.write("			</script>\r\n");
      out.write("			<div class=\"nav\">\r\n");
      out.write("				<div class=\"contents\">\r\n");
      out.write("					<h1>\r\n");
      out.write("						<a href=\"index.html\" tabindex=\"-1\"><img\r\n");
      out.write("							src=\"../logo_white.png\"\r\n");
      out.write("							alt=\"띵화관\" /></a>\r\n");
      out.write("					</h1>\r\n");
      out.write("					<ul class=\"nav_menu\">\r\n");
      out.write("						<li>\r\n");
      out.write("							<h2>\r\n");
      out.write("								<a href=\"movieChart.jsp\">영화</a>\r\n");
      out.write("							</h2>\r\n");
      out.write("							<dl class=\"nav_overMenu\">\r\n");
      out.write("								<dt>\r\n");
      out.write("									<h2>\r\n");
      out.write("										<a href=\"movieChart.jsp\" tabindex=\"-1\">영화</a>\r\n");
      out.write("									</h2>\r\n");
      out.write("								</dt>\r\n");
      out.write("\r\n");
      out.write("								<dd>\r\n");
      out.write("									<h3>\r\n");
      out.write("										<a href=\"movieChart.jsp\">무비차트</a>\r\n");
      out.write("									</h3>\r\n");
      out.write("								</dd>\r\n");
      out.write("							</dl>\r\n");
      out.write("						</li>\r\n");
      out.write("\r\n");
      out.write("						<li>\r\n");
      out.write("							<h2>\r\n");
      out.write("								<a href=\"ticket.jsp\"><strong>예매</strong></a>\r\n");
      out.write("							</h2>\r\n");
      out.write("\r\n");
      out.write("							<dl class=\"nav_overMenu\">\r\n");
      out.write("								<dt>\r\n");
      out.write("									<h2>\r\n");
      out.write("										<a href=\"ticket.jsp\" tabindex=\"-1\">예매</a>\r\n");
      out.write("									</h2>\r\n");
      out.write("								</dt>\r\n");
      out.write("\r\n");
      out.write("								<dd>\r\n");
      out.write("									<h3>\r\n");
      out.write("										<a href=\"ticket.jsp\">빠른예매</a>\r\n");
      out.write("									</h3>\r\n");
      out.write("								</dd>\r\n");
      out.write("\r\n");
      out.write("							</dl>\r\n");
      out.write("						</li>\r\n");
      out.write("\r\n");
      out.write("						<li>\r\n");
      out.write("							<h2>\r\n");
      out.write("								<a href=\"http://localhost/theater_prj/asd/jsp/board.jsp?FAQS=N\">공지사항</a>\r\n");
      out.write("							</h2>\r\n");
      out.write("\r\n");
      out.write("							<dl class=\"nav_overMenu\">\r\n");
      out.write("								<dt>\r\n");
      out.write("									<h2>\r\n");
      out.write("										<a href=\"http://localhost/theater_prj/asd/jsp/board.jsp?FAQS=N\">공지사항</a>\r\n");
      out.write("									</h2>\r\n");
      out.write("								</dt>\r\n");
      out.write("\r\n");
      out.write("								<dd>\r\n");
      out.write("									<h3>\r\n");
      out.write("										<a\r\n");
      out.write("											href=\"http://localhost/theater_prj/asd/jsp/board.jsp?FAQS=N\">공지사항</a>\r\n");
      out.write("									</h3>\r\n");
      out.write("								</dd>\r\n");
      out.write("\r\n");
      out.write("							</dl>\r\n");
      out.write("						</li>\r\n");
      out.write("\r\n");
      out.write("						<li>\r\n");
      out.write("							<h2>\r\n");
      out.write("								<a href=\"http://localhost/theater_prj/asd/jsp/board.jsp?FAQS=Q\">자주찾는 질문</a>\r\n");
      out.write("							</h2>\r\n");
      out.write("							<dl class=\"nav_overMenu\">\r\n");
      out.write("								<dt>\r\n");
      out.write("									<h2>\r\n");
      out.write("									<a href=\"http://localhost/theater_prj/asd/jsp/board.jsp?FAQS=Q\">자주찾는질문</a>\r\n");
      out.write("									</h2>\r\n");
      out.write("								</dt>\r\n");
      out.write("\r\n");
      out.write("								<dd>\r\n");
      out.write("									<h3>\r\n");
      out.write("										<a href=\"http://localhost/theater_prj/asd/jsp/board.jsp?FAQS=Q\">자주찾는질문</a>\r\n");
      out.write("									</h3>\r\n");
      out.write("								</dd>\r\n");
      out.write("\r\n");
      out.write("							</dl>\r\n");
      out.write("						</li>\r\n");
      out.write("						\r\n");
      out.write("\r\n");
      out.write("					</ul>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- 서브 메뉴 -->\r\n");
      out.write("		</div>\r\n");
      out.write("		<script type=\"text/javascript\">\r\n");
      out.write("    function setFAQSValue(value) {\r\n");
      out.write("        document.getElementById(\"FAQSInput\").value = value;\r\n");
      out.write("        document.getElementById(\"noticeForm\").submit();\r\n");
      out.write("    }\r\n");
      out.write("</script>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

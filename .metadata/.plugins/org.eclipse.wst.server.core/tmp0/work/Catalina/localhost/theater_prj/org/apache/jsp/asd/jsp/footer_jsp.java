/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-06-22 09:42:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.asd.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class footer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

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
      out.write("\r\n");
      out.write("\r\n");
      out.write("		<footer>\r\n");
      out.write("		\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("			<div id=\"BottomWrapper\" class=\"sect-ad\">\r\n");
      out.write("				<iframe\r\n");
      out.write("					src=\"https://ad.cgv.co.kr/NetInsight/html/CGV/CGV_201401/main@Bottom\"\r\n");
      out.write("					width=\"100%\" height=\"240\" title=\"\" frameborder=\"0\" scrolling=\"no\"\r\n");
      out.write("					marginwidth=\"0\" marginheight=\"0\" name=\"Bottom\" id=\"Bottom\"></iframe>\r\n");
      out.write("			</div>\r\n");
      out.write("			<ul class=\"policy_list\">\r\n");
      out.write("				<li><a href=\"\" target=\"_blank\">회사소개</a></li>\r\n");
      out.write("				<li><a href=\"\">이용약관</a></li>\r\n");
      out.write("				<li><a href=\"\"><strong>개인정보처리방침</strong></a></li>\r\n");
      out.write("				<li><a href=\"\">법적고지</a></li>\r\n");
      out.write("				<li><a href=\"\">이메일주소무단수집거부</a></li>\r\n");
      out.write("				<li><a href=\"../admin/jsp/dashboard.jsp\">관리자 로그인</a></li>\r\n");
      out.write("			</ul>\r\n");
      out.write("			<article class=\"company_info_wrap\">\r\n");
      out.write("				<section class=\"company_info\">\r\n");
      out.write("\r\n");
      out.write("					<address>(16293)경기도 수원시 장안구 조원동 광교산 임광그대가 101동 1002호</address>\r\n");
      out.write("\r\n");
      out.write("					<dl class=\"company_info_list\">\r\n");
      out.write("						<dt>대표이사</dt>\r\n");
      out.write("						<dd>윤웅찬</dd>\r\n");
      out.write("						<dt>사업자등록번호</dt>\r\n");
      out.write("						<dd>010-8623-5905</dd>\r\n");
      out.write("						<dt>통신판매업신고번호</dt>\r\n");
      out.write("						<dd>\r\n");
      out.write("							1998-경기수원-0513 <a href=\"\" onclick=\"goFtc()\"\r\n");
      out.write("								class=\"btn_goFtc\">사업자정보확인<a></a></a>\r\n");
      out.write("						</dd>\r\n");
      out.write("					</dl>\r\n");
      out.write("\r\n");
      out.write("					<dl class=\"company_info_list\">\r\n");
      out.write("						<dt>호스팅사업자</dt>\r\n");
      out.write("						<dd>SSANGYONG</dd>\r\n");
      out.write("						<dt>개인정보보호 책임자</dt>\r\n");
      out.write("						<dd>윤웅찬</dd>\r\n");
      out.write("						<dt>대표이메일</dt>\r\n");
      out.write("						<dd>woong@sist.co.kr</dd>\r\n");
      out.write("\r\n");
      out.write("					</dl>\r\n");
      out.write("\r\n");
      out.write("					<p class=\"copyright\">&copy; 예찬,주희,지민,무영,웅찬 LET'S GO</p>\r\n");
      out.write("				</section>\r\n");
      out.write("			</article>\r\n");
      out.write("			<script>\r\n");
      out.write("				//footer GA Analytics 영역 LOG\r\n");
      out.write("				$('.policy_list > li > a').on({\r\n");
      out.write("					click : function(e) {\r\n");
      out.write("						gaEventLog('PC_footer', this.text, '');\r\n");
      out.write("					}\r\n");
      out.write("				});\r\n");
      out.write("			</script>\r\n");
      out.write("\r\n");
      out.write("		</footer>\r\n");
      out.write("\r\n");
      out.write("		\r\n");
      out.write("\r\n");
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

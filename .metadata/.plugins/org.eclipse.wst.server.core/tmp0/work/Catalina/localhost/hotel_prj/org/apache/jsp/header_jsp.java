/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-05-23 08:28:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

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
      out.write("\r\n");
      out.write("			<div class=\"header\"> <!-- 메뉴 열리면 gnbOn 클래스 추가 -->\r\n");
      out.write("			<!-- header type02 추가 되는 경우 mainArea02, mainArea03, mainArea05  -->\r\n");
      out.write("			<div class=\"headArea\">\r\n");
      out.write("				<strong class=\"logo\"><a href=\"http://localhost/hotel_prj/index.jsp\">JOSUN HOTELS & RESORTS</a></strong>\r\n");
      out.write("				<button type=\"button\" class=\"btnMenu\">메뉴 열기</button> <!-- 클릭하면 menuOn 클래스 추가, 메뉴 닫기 텍스트 변경 -->\r\n");
      out.write("				<!-- 20200709 수정 / gnbUtil 안에 있던 호텔찾기, 다국어 영역 위치 변경  -->\r\n");
      out.write("				<div class=\"topUtil\">\r\n");
      out.write("					<!-- <a href=\"#none\" class=\"hotelFind\" onClick=\"commonJs.popShow($('#hotelFindLayer'))\">호텔찾기</a> -->\r\n");
      out.write("                    <a href=\"http://localhost/hotel_prj/package/list.jsp\" class=\"hotelFind\" >상품찾기</a>\r\n");
      out.write("					<div class=\"langArea\">\r\n");
      out.write("						<div class=\"dropdown_list\" aria-expanded=\"false\">\r\n");
      out.write("							<div class=\"dropdown_value\">\r\n");
      out.write("								<input type=\"text\" role=\"combobox\" value=\"KR\" aria-expanded=\"false\" tabindex=\"-1\" readonly>\r\n");
      out.write("								<button type=\"button\" aria-label=\"목록열기\" class=\"btn_opener\"></button>\r\n");
      out.write("							</div>\r\n");
      out.write("							<ul class=\"item_list\" role=\"listbox\">\r\n");
      out.write("								<li role=\"option\" class=\"langKr\"><a href=\"javascript:fncChangeLang('ko');\">KR</a></li>\r\n");
      out.write("								<li role=\"option\" class=\"langEn\"><a href=\"javascript:fncChangeLang('en');\">EN</a></li>\r\n");
      out.write("								<li role=\"option\" class=\"langCn\"><a href=\"javascript:fncChangeLang('zh');\">CN</a></li>\r\n");
      out.write("								<li role=\"option\" class=\"langJp\"><a href=\"javascript:fncChangeLang('ja');\">JP</a></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("				<!-- //20200709 수정 -->\r\n");
      out.write("				<div class=\"allMenu\"> <!-- 화면 높이값 계산 height:적용, body:overflow:hidden -->\r\n");
      out.write("					<div class=\"inner\">\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("                <!-- 프로모션 배너 -->\r\n");
      out.write("                \r\n");
      out.write("                    <div class=\"promotionBanner\">\r\n");
      out.write("                        <a href=\"https://www.josunhotel.com/esgPromotion/main.do\">\r\n");
      out.write("                            <img src=\"http://localhost/hotel_prj/static/home/images/ko/pc/common/pc_img_promotion_banner.jpg\" alt=\"\">\r\n");
      out.write("                        </a>\r\n");
      out.write("                    </div>\r\n");
      out.write("                \r\n");
      out.write("\r\n");
      out.write("						<ul class=\"menuDepth01\">\r\n");
      out.write("						\r\n");
      out.write("						\r\n");
      out.write("							\r\n");
      out.write("						\r\n");
      out.write("							\r\n");
      out.write("								\r\n");
      out.write("								\r\n");
      out.write("                                <li  >ABOUT US\r\n");
      out.write("									\r\n");
      out.write("										<ul class=\"menuDepth02\">\r\n");
      out.write("																					\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("													<li><a href=\"/about/hotel.do\">JOSUN HOTELS &amp; RESORTS</a>\r\n");
      out.write("													\r\n");
      out.write("													\r\n");
      out.write("														<ul class=\"menuDepth03\">\r\n");
      out.write("															\r\n");
      out.write("                                                                \r\n");
      out.write("																    <li><a href=\"/about/hotel.do\">기업소개</a></li>\r\n");
      out.write("                                                                \r\n");
      out.write("															\r\n");
      out.write("                                                                \r\n");
      out.write("																    <li><a href=\"/about/history.do\">연혁</a></li>\r\n");
      out.write("                                                                \r\n");
      out.write("															\r\n");
      out.write("                                                                \r\n");
      out.write("																    <li><a href=\"/about/awards.do\">수상내역</a></li>\r\n");
      out.write("                                                                \r\n");
      out.write("															\r\n");
      out.write("                                                                \r\n");
      out.write("																    <li><a href=\"/about/esg.do\">ESG경영</a></li>\r\n");
      out.write("                                                                \r\n");
      out.write("															\r\n");
      out.write("                                                                \r\n");
      out.write("																    <li><a href=\"/about/accounts.do\">결산공고</a></li>\r\n");
      out.write("                                                                \r\n");
      out.write("															\r\n");
      out.write("                                                                \r\n");
      out.write("																    <li><a href=\"/about/location.do\">오시는길</a></li>\r\n");
      out.write("                                                                \r\n");
      out.write("															\r\n");
      out.write("                                                                \r\n");
      out.write("															\r\n");
      out.write("														</ul>\r\n");
      out.write("													\r\n");
      out.write("													</li>\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("													<li><a href=\"/press/actReport.do\">NEWS</a>\r\n");
      out.write("													\r\n");
      out.write("													\r\n");
      out.write("														<ul class=\"menuDepth03\">\r\n");
      out.write("															\r\n");
      out.write("                                                                \r\n");
      out.write("																    <li><a href=\"/press/actReport.do\">주요소식</a></li>\r\n");
      out.write("                                                                \r\n");
      out.write("															\r\n");
      out.write("                                                                \r\n");
      out.write("															\r\n");
      out.write("                                                                \r\n");
      out.write("																    <li><a href=\"/press/social.do\">소셜 미디어</a></li>\r\n");
      out.write("                                                                \r\n");
      out.write("															\r\n");
      out.write("														</ul>\r\n");
      out.write("													\r\n");
      out.write("													</li>\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("													<li><a href=\"/recruit/employment.do\">RECRUIT</a>\r\n");
      out.write("													\r\n");
      out.write("													\r\n");
      out.write("													</li>\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("										</ul>\r\n");
      out.write("									\r\n");
      out.write("								</li>\r\n");
      out.write("							\r\n");
      out.write("						\r\n");
      out.write("							\r\n");
      out.write("								\r\n");
      out.write("								\r\n");
      out.write("                                <li  >HOTELS\r\n");
      out.write("									\r\n");
      out.write("										<ul class=\"menuDepth02\">\r\n");
      out.write("																					\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("													<li><a href=\"/hotel/JosunPalace.do\">조선 팰리스</a>\r\n");
      out.write("													\r\n");
      out.write("													\r\n");
      out.write("													</li>\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("													<li><a href=\"/hotel/westinSeoul.do\">웨스틴 조선 서울</a>\r\n");
      out.write("													\r\n");
      out.write("													\r\n");
      out.write("													</li>\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("													<li><a href=\"/hotel/westinBusan.do\">웨스틴 조선 부산</a>\r\n");
      out.write("													\r\n");
      out.write("													\r\n");
      out.write("													</li>\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("													<li><a href=\"/hotel/grandBusan.do\">그랜드 조선 부산</a>\r\n");
      out.write("													\r\n");
      out.write("													\r\n");
      out.write("													</li>\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("													<li><a href=\"/hotel/grandJeju.do\">그랜드 조선 제주</a>\r\n");
      out.write("													\r\n");
      out.write("													\r\n");
      out.write("													</li>\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("													<li><a href=\"/hotel/lescape.do\">레스케이프 호텔</a>\r\n");
      out.write("													\r\n");
      out.write("													\r\n");
      out.write("													</li>\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("													<li><a href=\"/hotel/pangyo.do\">그래비티 서울 판교</a>\r\n");
      out.write("													\r\n");
      out.write("													\r\n");
      out.write("													</li>\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("													<li><a href=\"/hotel/fpbsSeoul.do\">포포인츠 바이 쉐라톤 조선 서울역</a>\r\n");
      out.write("													\r\n");
      out.write("													\r\n");
      out.write("													</li>\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("													<li><a href=\"/hotel/fpbsMyeongdong.do\">포포인츠 바이 쉐라톤 조선, 서울 명동</a>\r\n");
      out.write("													\r\n");
      out.write("													\r\n");
      out.write("													</li>\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("													<li><a href=\"/hotel/parasparaSeoul.do\">파라스파라 서울</a>\r\n");
      out.write("													\r\n");
      out.write("													\r\n");
      out.write("													</li>\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("													<li><a href=\"/hotel/Corallo.do\">코랄로 바이 조선</a>\r\n");
      out.write("													\r\n");
      out.write("													\r\n");
      out.write("													</li>\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("										</ul>\r\n");
      out.write("									\r\n");
      out.write("								</li>\r\n");
      out.write("							\r\n");
      out.write("						\r\n");
      out.write("							\r\n");
      out.write("								\r\n");
      out.write("								\r\n");
      out.write("                                <li  >OFFERS\r\n");
      out.write("									\r\n");
      out.write("										<ul class=\"menuDepth02\">\r\n");
      out.write("																					\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("													<li><a href=\"/package/list.do\">PACKAGE</a>\r\n");
      out.write("													\r\n");
      out.write("													\r\n");
      out.write("													</li>\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("													<li><a href=\"/event/list.do\">EVENT</a>\r\n");
      out.write("													\r\n");
      out.write("													\r\n");
      out.write("													</li>\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("										</ul>\r\n");
      out.write("									\r\n");
      out.write("								</li>\r\n");
      out.write("							\r\n");
      out.write("						\r\n");
      out.write("							\r\n");
      out.write("								\r\n");
      out.write("								\r\n");
      out.write("                                <li  >MEMBERSHIP\r\n");
      out.write("									\r\n");
      out.write("										<ul class=\"menuDepth02\">\r\n");
      out.write("																					\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("													<li><a href=\"/membership/ed2_product.do\">CLUB JOSUN</a>\r\n");
      out.write("													\r\n");
      out.write("													\r\n");
      out.write("													</li>\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("													<li><a href=\"/membership/event.do\">EVENT</a>\r\n");
      out.write("													\r\n");
      out.write("													\r\n");
      out.write("													</li>\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("													<li><a href=\"/membership/news.do\">NEWS</a>\r\n");
      out.write("													\r\n");
      out.write("													\r\n");
      out.write("													</li>\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("										</ul>\r\n");
      out.write("									\r\n");
      out.write("								</li>\r\n");
      out.write("							\r\n");
      out.write("						\r\n");
      out.write("							\r\n");
      out.write("								\r\n");
      out.write("								\r\n");
      out.write("                                <li  >MY PAGE\r\n");
      out.write("									\r\n");
      out.write("										<ul class=\"menuDepth02\">\r\n");
      out.write("																					\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("													<li><a href=\"/mypage/main.do\">MY PAGE</a>\r\n");
      out.write("													\r\n");
      out.write("													\r\n");
      out.write("													</li>\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("													<li><a href=\"/mypage/myPointForm.do\">MY POINT</a>\r\n");
      out.write("													\r\n");
      out.write("													\r\n");
      out.write("													</li>\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("													<li><a href=\"/mypage/myCouponaForm.do\">MY COUPON</a>\r\n");
      out.write("													\r\n");
      out.write("													\r\n");
      out.write("													</li>\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("													<li><a href=\"/mypage/myGoodsForm.do\">멤버십확인</a>\r\n");
      out.write("													\r\n");
      out.write("													\r\n");
      out.write("													</li>\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("													<li><a href=\"/cnfirm/mber/room/reserveList.do\">예약확인</a>\r\n");
      out.write("													\r\n");
      out.write("													\r\n");
      out.write("													</li>\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("													<li><a href=\"/mber/interest/roomList.do\">관심리스트</a>\r\n");
      out.write("													\r\n");
      out.write("													\r\n");
      out.write("													</li>\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("													<li><a href=\"/mypage/myInfoForm.do\">개인정보관리</a>\r\n");
      out.write("													\r\n");
      out.write("													\r\n");
      out.write("													</li>\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("										</ul>\r\n");
      out.write("									\r\n");
      out.write("								</li>\r\n");
      out.write("							\r\n");
      out.write("						\r\n");
      out.write("							\r\n");
      out.write("								\r\n");
      out.write("								\r\n");
      out.write("                                <li  >RETAIL BUSINESS\r\n");
      out.write("									\r\n");
      out.write("										<ul class=\"menuDepth02\">\r\n");
      out.write("																					\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("													<li><a href=\"/retail/homurang.do\">Restaurants</a>\r\n");
      out.write("													\r\n");
      out.write("													\r\n");
      out.write("														<ul class=\"menuDepth03\">\r\n");
      out.write("															\r\n");
      out.write("                                                                \r\n");
      out.write("																    <li><a href=\"/retail/homurang.do\">호무랑</a></li>\r\n");
      out.write("                                                                \r\n");
      out.write("															\r\n");
      out.write("                                                                \r\n");
      out.write("																    <li><a href=\"/retail/hokyungjeon.do\">호경전</a></li>\r\n");
      out.write("                                                                \r\n");
      out.write("															\r\n");
      out.write("                                                                \r\n");
      out.write("																    <li><a href=\"/retail/jaju.do\">자주 테이블</a></li>\r\n");
      out.write("                                                                \r\n");
      out.write("															\r\n");
      out.write("                                                                \r\n");
      out.write("																    <li><a href=\"/retail/mott32seoul.do\">MOTT 32 SEOUL</a></li>\r\n");
      out.write("                                                                \r\n");
      out.write("															\r\n");
      out.write("														</ul>\r\n");
      out.write("													\r\n");
      out.write("													</li>\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("													<li><a href=\"/product/kyukmul.do\">PRODUCT</a>\r\n");
      out.write("													\r\n");
      out.write("													\r\n");
      out.write("														<ul class=\"menuDepth03\">\r\n");
      out.write("															\r\n");
      out.write("                                                                \r\n");
      out.write("																    <li><a href=\"/product/kyukmul.do\">격물공부</a></li>\r\n");
      out.write("                                                                \r\n");
      out.write("															\r\n");
      out.write("                                                                \r\n");
      out.write("																    <li><a href=\"/product/kimchi.do\">조선호텔 김치</a></li>\r\n");
      out.write("                                                                \r\n");
      out.write("															\r\n");
      out.write("                                                                \r\n");
      out.write("																    <li><a href=\"/product/janePacker.do\">제인패커</a></li>\r\n");
      out.write("                                                                \r\n");
      out.write("															\r\n");
      out.write("														</ul>\r\n");
      out.write("													\r\n");
      out.write("													</li>\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("													<li><a href=\"/office/stateTower.do\">OFFICE MANAGEMENT SERVICES</a>\r\n");
      out.write("													\r\n");
      out.write("													\r\n");
      out.write("														<ul class=\"menuDepth03\">\r\n");
      out.write("															\r\n");
      out.write("                                                                \r\n");
      out.write("																    <li><a href=\"/office/stateTower.do\">스테이트 타워</a></li>\r\n");
      out.write("                                                                \r\n");
      out.write("															\r\n");
      out.write("                                                                \r\n");
      out.write("																    <li><a href=\"/office/centerfield.do\">센터필드</a></li>\r\n");
      out.write("                                                                \r\n");
      out.write("															\r\n");
      out.write("														</ul>\r\n");
      out.write("													\r\n");
      out.write("													</li>\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("										</ul>\r\n");
      out.write("									\r\n");
      out.write("								</li>\r\n");
      out.write("							\r\n");
      out.write("						\r\n");
      out.write("							\r\n");
      out.write("								\r\n");
      out.write("								\r\n");
      out.write("                                <li class=\"gnb-customer\" >CUSTOMER SERVICE\r\n");
      out.write("									\r\n");
      out.write("										<ul class=\"menuDepth02\">\r\n");
      out.write("																					\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("													<li><a href=\"/voc/cstmrOpinionForm.do\">Q&amp;A</a>\r\n");
      out.write("													\r\n");
      out.write("													\r\n");
      out.write("													</li>\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("													<li><a href=\"/customer/faq.do\">FAQ</a>\r\n");
      out.write("													\r\n");
      out.write("													\r\n");
      out.write("													</li>\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("												\r\n");
      out.write("													<li><a href=\"/customer/giftCard.do\">GIFT CARD</a>\r\n");
      out.write("													\r\n");
      out.write("													\r\n");
      out.write("													</li>\r\n");
      out.write("												\r\n");
      out.write("											\r\n");
      out.write("										</ul>\r\n");
      out.write("									\r\n");
      out.write("								</li>\r\n");
      out.write("							\r\n");
      out.write("						\r\n");
      out.write("							\r\n");
      out.write("						\r\n");
      out.write("							\r\n");
      out.write("						\r\n");
      out.write("							\r\n");
      out.write("						\r\n");
      out.write("							\r\n");
      out.write("						\r\n");
      out.write("							\r\n");
      out.write("						\r\n");
      out.write("							\r\n");
      out.write("						\r\n");
      out.write("							\r\n");
      out.write("						\r\n");
      out.write("							\r\n");
      out.write("						\r\n");
      out.write("							\r\n");
      out.write("						\r\n");
      out.write("                        </ul>\r\n");
      out.write("        \r\n");
      out.write("        <ul class=\"menuDepth-add\">\r\n");
      out.write("            <li>JOSUN LOUNGE\r\n");
      out.write("                <ul class=\"gnb-thum\">\r\n");
      out.write("                    \r\n");
      out.write("                        <li class=\"hidden\">\r\n");
      out.write("                            <a href=\"https://lounge.josunhotel.com/04/suite-jeju-sweet-journey/\" target=\"_blank\">\r\n");
      out.write("                                <img src=\"util/file/download.do?fileSn=2010120&sysCode=JOSUNHOTEL\" alt=\"그랜드 조선 제주 스위트룸\">\r\n");
      out.write("                                <span>Suite Tour</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    \r\n");
      out.write("                        <li class=\"hidden\">\r\n");
      out.write("                            <a href=\"https://lounge.josunhotel.com/04/wedding-must-go-on/\" target=\"_blank\">\r\n");
      out.write("                                <img src=\"util/file/download.do?fileSn=2010127&sysCode=JOSUNHOTEL\" alt=\"웨스틴 조선 서울 웨딩\">\r\n");
      out.write("                                <span>Commentary</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    \r\n");
      out.write("                        <li class=\"hidden\">\r\n");
      out.write("                            <a href=\"https://lounge.josunhotel.com/04/mindful-stay-to-mindful-picnic/\" target=\"_blank\">\r\n");
      out.write("                                <img src=\"util/file/download.do?fileSn=2010184&sysCode=JOSUNHOTEL\" alt=\"ESG\">\r\n");
      out.write("                                <span>Behind</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    \r\n");
      out.write("                        <li class=\"hidden\">\r\n");
      out.write("                            <a href=\"https://lounge.josunhotel.com/04/josun-hotel-heritage-quiz/\" target=\"_blank\">\r\n");
      out.write("                                <img src=\"util/file/download.do?fileSn=2010189&sysCode=JOSUNHOTEL\" alt=\"조선 헤리티지\">\r\n");
      out.write("                                <span>Q&amp;A</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    \r\n");
      out.write("                        <li class=\"hidden\">\r\n");
      out.write("                            <a href=\"https://lounge.josunhotel.com/04/the-legendary-hokyungjeon/\" target=\"_blank\">\r\n");
      out.write("                                <img src=\"util/file/download.do?fileSn=2010215&sysCode=JOSUNHOTEL\" alt=\"호경전\">\r\n");
      out.write("                                <span>Explore</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    \r\n");
      out.write("                        <li class=\"hidden\">\r\n");
      out.write("                            <a href=\"https://lounge.josunhotel.com/04/its-picnic-season/\" target=\"_blank\">\r\n");
      out.write("                                <img src=\"util/file/download.do?fileSn=2010225&sysCode=JOSUNHOTEL\" alt=\"조선호텔 피크닉\">\r\n");
      out.write("                                <span>Recommend</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                        </li>\r\n");
      out.write("                    \r\n");
      out.write("                </ul>\r\n");
      out.write("            </li>\r\n");
      out.write("        </ul>\r\n");
      out.write("						<button type=\"button\" class=\"btnClose\" onclick=\"commonJs.popClose($('#layerPop1'))\">닫기</button>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- //allMenu -->\r\n");
      out.write("				<div class=\"gnbUtil\">\r\n");
      out.write("					\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li><a href=\"/hotel_prj/membership/ed2_product.do\" id=\"membership\">멤버십</a></li>\r\n");
      out.write("							<li><a href=\"/hotel_prj/login/loginForm.jsp\" id=\"login\">로그인</a></li>\r\n");
      out.write("							<li><a href=\"/hotel_prj/identify/identifyIntro.jsp\" id=\"join\">회원가입</a></li>\r\n");
      out.write("							<li><a href=\"/hotel_prj/login/noMbrLoginForm.do\" id=\"confirmReserv\">예약확인</a></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					\r\n");
      out.write("					\r\n");
      out.write("					<!-- 20200723 수정 / 버튼에서 드롭다운으로 변경 -->\r\n");
      out.write("					<div class=\"resvBtn\">\r\n");
      out.write("						<div class=\"dropdown_list\" aria-expanded=\"false\">\r\n");
      out.write("							<div class=\"dropdown_value\">\r\n");
      out.write("								<input type=\"text\" role=\"combobox\" value=\"RESERVATION\" aria-expanded=\"false\" tabindex=\"-1\" readonly>\r\n");
      out.write("								<button type=\"button\" aria-label=\"목록열기\" class=\"btn_opener\"></button>\r\n");
      out.write("							</div>\r\n");
      out.write("							<ul class=\"item_list\" role=\"listbox\">\r\n");
      out.write("								<li role=\"option\"><a href=\"/hotel_prj/resve/room/step0.jsp\" id=\"roomSearchGNB\">ROOM</a></li>\r\n");
      out.write("                                \r\n");
      out.write("      								<li role=\"option\"><a href=\"/resve/dining/resveForm.do?searchSysCode=TWC&searchDiningCode=003\" id=\"diningSearchGNB\">DINING</a></li>                             \r\n");
      out.write("                                \r\n");
      out.write("								<li role=\"option\"><a href=\"/mypage/myCouponaForm.do\">MEMBERSHIP</a></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<!-- //20200723 수정 -->\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- //gnbUtil -->\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
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

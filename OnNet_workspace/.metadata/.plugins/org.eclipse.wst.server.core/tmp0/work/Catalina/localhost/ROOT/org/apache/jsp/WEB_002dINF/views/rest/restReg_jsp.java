/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.37
 * Generated at: 2020-11-05 07:24:06 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.rest;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class restReg_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/E:/SpringBackEndClass/OnNet_workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/OnNet/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1600306517462L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
      out.write("   \r\n");
      out.write("<div id=\"sectionContainerCenter\">\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<form id=\"frm\" action=\"/rest/reg\" method=\"post\" onsubmit=\"return chkFrm()\">\r\n");
      out.write("\t\t\t<div><input type=\"text\" name=\"nm\" placeholder=\"가게명\"></div>\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"addr\" placeholder=\"주소\" onkeyup=\"changeAddr()\" style=\"width:200px;\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" onclick=\"getLatLng()\">좌표가져오기</button><span id=\"resultGetLatLng\"></span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"lat\" value=\"0\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"lng\" value=\"0\">\r\n");
      out.write("\t\t\t<div>\r\n");
      out.write("\t\t\t\t카테고리 : \r\n");
      out.write("\t\t\t\t<select name=\"cd_category\">\r\n");
      out.write("\t\t\t\t\t<option value=\"0\">--선택--</option>\r\n");
      out.write("\t\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t\t</select>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div><input type=\"submit\" value=\"등록\"></div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"//dapi.kakao.com/v2/maps/sdk.js?appkey=1ab3d71d45b40c5eaec83805c9a73569&libraries=services\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\tfunction chkFrm() {\r\n");
      out.write("\t\t\tif(frm.nm.value.length == 0) {\r\n");
      out.write("\t\t\t\talert('가게명을 입력해 주세요')\r\n");
      out.write("\t\t\t\tfrm.nm.focus()\r\n");
      out.write("\t\t\t\treturn false\t\r\n");
      out.write("\t\t\t} else if(frm.addr.value.length < 9) {\r\n");
      out.write("\t\t\t\talert('주소를 확인해 주세요')\r\n");
      out.write("\t\t\t\tfrm.addr.focus()\r\n");
      out.write("\t\t\t\treturn false\t\r\n");
      out.write("\t\t\t} else if(frm.lat.value == '0' || frm.lng.value == '0') {\r\n");
      out.write("\t\t\t\talert('좌표값을 가져와 주세요.')\t\t\t\t\r\n");
      out.write("\t\t\t\treturn false\r\n");
      out.write("\t\t\t} else if(frm.cd_category.value == '0') {\r\n");
      out.write("\t\t\t\talert('카테고리를 선택해 주세요')\r\n");
      out.write("\t\t\t\tfrm.cd_category.focus()\r\n");
      out.write("\t\t\t\treturn false\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\t\r\n");
      out.write("\t\r\n");
      out.write("\t\tfunction changeAddr() {\r\n");
      out.write("\t\t\tresultGetLatLng.innerText = ''\r\n");
      out.write("\t\t\tfrm.lat.value = '0'\r\n");
      out.write("\t\t\tfrm.lng.value = '0'\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\r\n");
      out.write("\t\tconst geocoder = new kakao.maps.services.Geocoder();\r\n");
      out.write("\t\tfunction getLatLng() {\r\n");
      out.write("\t\t\tconst addrStr = frm.addr.value\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tif(addrStr.length < 9) {\r\n");
      out.write("\t\t\t\talert('주소를 확인해 주세요')\r\n");
      out.write("\t\t\t\tfrm.addr.focus()\r\n");
      out.write("\t\t\t\treturn\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tgeocoder.addressSearch(addrStr, function(result, status) {\r\n");
      out.write("\t\t\t\tif (status === kakao.maps.services.Status.OK) {\r\n");
      out.write("\t\t\t        console.log(result[0]);\r\n");
      out.write("\t\t\t        \r\n");
      out.write("\t\t\t        if(result.length > 0) {\r\n");
      out.write("\t\t\t        \tresultGetLatLng.innerText = 'V'\r\n");
      out.write("\t\t\t        \tfrm.lat.value = result[0].y\r\n");
      out.write("\t\t\t\t        frm.lng.value = result[0].x\r\n");
      out.write("\t\t\t        }\t\t\t        \r\n");
      out.write("\t\t\t    }\t\r\n");
      out.write("\t\t\t});\t\t\t\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</div>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /WEB-INF/views/rest/restReg.jsp(18,5) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/views/rest/restReg.jsp(18,5) '${categoryList}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${categoryList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      // /WEB-INF/views/rest/restReg.jsp(18,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("item");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t\t<option value=\"");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.cd}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write('"');
            out.write('>');
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${item.val}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</option>\r\n");
            out.write("\t\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}

package clojure.java;

import clojure.lang.*;

public final class io_loading__4931__auto__ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Symbol const__1;
 public static final clojure.lang.Var const__2;
 public static final clojure.lang.Symbol const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "refer");
  const__1 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.core");
  const__2 = (clojure.lang.Var)RT.var("clojure.core", "require");
  const__3 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.string");
 }
 public io_loading__4931__auto__() {
  super();
 }
 public java.lang.Object invoke() {
  clojure.lang.Var.pushThreadBindings((clojure.lang.Associative)((clojure.lang.Associative)RT.mapUniqueKeys(((clojure.lang.Var)clojure.lang.Compiler.LOADER), ((java.lang.ClassLoader)((java.lang.Class)((java.lang.Class)((java.lang.Object)this).getClass())).getClassLoader()))));
  try {
   ((IFn)const__0.getRawRoot()).invoke(const__1);
   ((IFn)const__2.getRawRoot()).invoke(const__3);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(java.io.Reader.class);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(java.io.InputStream.class);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(java.io.InputStreamReader.class);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(java.io.PushbackReader.class);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(java.io.BufferedReader.class);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(java.io.File.class);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(java.io.OutputStream.class);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(java.io.OutputStreamWriter.class);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(java.io.BufferedWriter.class);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(java.io.Writer.class);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(java.io.FileInputStream.class);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(java.io.FileOutputStream.class);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(java.io.ByteArrayOutputStream.class);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(java.io.StringReader.class);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(java.io.ByteArrayInputStream.class);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(java.io.BufferedInputStream.class);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(java.io.BufferedOutputStream.class);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(java.io.CharArrayReader.class);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(java.io.Closeable.class);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(java.net.URI.class);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(java.net.URL.class);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(java.net.MalformedURLException.class);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(java.net.Socket.class);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(java.net.URLDecoder.class);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(java.net.URLEncoder.class);
   return null;
  } finally {
   clojure.lang.Var.popThreadBindings();
  }
 }
}

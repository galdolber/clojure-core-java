package clojure;

import clojure.lang.*;

public final class instant_loading__4931__auto__ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Symbol const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "refer");
  const__1 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.core");
 }
 public instant_loading__4931__auto__() {
  super();
 }
 public java.lang.Object invoke() {
  clojure.lang.Var.pushThreadBindings((clojure.lang.Associative)((clojure.lang.Associative)RT.mapUniqueKeys(((clojure.lang.Var)clojure.lang.Compiler.LOADER), ((java.lang.ClassLoader)((java.lang.Class)((java.lang.Class)((java.lang.Object)this).getClass())).getClassLoader()))));
  try {
   ((IFn)const__0.getRawRoot()).invoke(const__1);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(java.util.Calendar.class);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(java.util.Date.class);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(java.util.GregorianCalendar.class);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(java.util.TimeZone.class);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(java.sql.Timestamp.class);
   return null;
  } finally {
   clojure.lang.Var.popThreadBindings();
  }
 }
}

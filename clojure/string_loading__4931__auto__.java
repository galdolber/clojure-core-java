package clojure;

import clojure.lang.*;

public final class string_loading__4931__auto__ extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Symbol const__1;
 public static final clojure.lang.Keyword const__2;
 public static final clojure.lang.IPersistentStack const__3;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "refer");
  const__1 = (clojure.lang.Symbol)Symbol.intern(null, "clojure.core");
  const__2 = (clojure.lang.Keyword)Keyword.intern(null, "exclude");
  const__3 = (clojure.lang.IPersistentStack)((clojure.lang.IObj)PersistentList.create(java.util.Arrays.asList(Symbol.intern(null, "replace"), Symbol.intern(null, "reverse")))).withMeta((IPersistentMap)RT.map(Keyword.intern(null, "line"), 42, Keyword.intern(null, "column"), 28));
 }
 public string_loading__4931__auto__() {
  super();
 }
 public java.lang.Object invoke() {
  clojure.lang.Var.pushThreadBindings((clojure.lang.Associative)((clojure.lang.Associative)RT.mapUniqueKeys(((clojure.lang.Var)clojure.lang.Compiler.LOADER), ((java.lang.ClassLoader)((java.lang.Class)((java.lang.Class)((java.lang.Object)this).getClass())).getClassLoader()))));
  try {
   ((IFn)const__0.getRawRoot()).invoke(const__1, const__2, const__3);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(java.util.regex.Pattern.class);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(java.util.regex.Matcher.class);
   ((Namespace)RT.CURRENT_NS.deref()).importClass(clojure.lang.LazilyPersistentVector.class);
   return null;
  } finally {
   clojure.lang.Var.popThreadBindings();
  }
 }
}

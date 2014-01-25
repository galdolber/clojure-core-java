package clojure;

import clojure.lang.*;

public final class core_fn__5479 extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final clojure.lang.Keyword const__1;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "primitives-classnames");
  const__1 = (clojure.lang.Keyword)Keyword.intern(null, "else");
 }
 public core_fn__5479() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object c1, java.lang.Object w2) {
  try {
   if (((java.lang.Class)c1).isPrimitive()) {
    ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)"#=(identity "));
    ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)((IFn)const__0.getRawRoot()).invoke(c1)));
    ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)")"));
    return null;
   } else {
    if (((java.lang.Class)c1).isArray()) {
     ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)"#=(java.lang.Class/forName \""));
     ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)((java.lang.String)((java.lang.Class)c1).getName())));
     ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)"\")"));
     return null;
    } else {
     Object __r3475 = const__1;
     if (__r3475 != null && !(__r3475 == Boolean.FALSE)) {
      ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)"#="));
      ((java.io.Writer)w2).write((java.lang.String)((java.lang.String)((java.lang.String)((java.lang.Class)c1).getName())));
      return null;
     } else {
      return null;
     }
    }
   }
  } catch (Exception ___e) {
   throw Util.sneakyThrow(___e);
  }
 }
}

package clojure.java;

import clojure.lang.*;

public final class io_encoding extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "encoding");
 }
 public io_encoding() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object opts1) {
  {
   Object or__3968__auto__2 = RT.get(opts1, Keyword.intern(null, "encoding"));
   Object __r6268 = or__3968__auto__2;
   if (__r6268 != null && !(__r6268 == Boolean.FALSE)) {
    return or__3968__auto__2;
   } else {
    return "UTF-8";
   }
  }
 }
}

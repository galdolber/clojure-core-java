package clojure.java;

import clojure.lang.*;

public final class io_buffer_size extends clojure.lang.AFunction {
 public static final clojure.lang.Keyword const__0;
 public static final java.lang.Object const__1;
 static {
  const__0 = (clojure.lang.Keyword)Keyword.intern(null, "buffer-size");
  const__1 = (java.lang.Object)1024L;
 }
 public io_buffer_size() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object opts1) {
  {
   Object or__3968__auto__2 = RT.get(opts1, Keyword.intern(null, "buffer-size"));
   Object __r6270 = or__3968__auto__2;
   if (__r6270 != null && !(__r6270 == Boolean.FALSE)) {
    return or__3968__auto__2;
   } else {
    return const__1;
   }
  }
 }
}

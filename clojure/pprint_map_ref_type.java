package clojure;

import clojure.lang.*;

public final class pprint_map_ref_type extends clojure.lang.AFunction {
 public static final clojure.lang.Var const__0;
 public static final java.lang.Object const__1;
 public static final clojure.lang.Var const__2;
 static {
  const__0 = (clojure.lang.Var)RT.var("clojure.core", "re-find");
  const__1 = (java.lang.Object)java.util.regex.Pattern.compile("^[^$]+\\$[^$]+");
  const__2 = (clojure.lang.Var)RT.var("clojure.pprint", "type-map");
 }
 public pprint_map_ref_type() {
  super();
 }
 public java.lang.Object invoke(java.lang.Object name1) {
  {
   Object __r5940 = null;
   {
    Object temp__4117__auto__2 = ((IFn)const__0.getRawRoot()).invoke(const__1, name1);
    Object __r5941;
    Object __r5942 = temp__4117__auto__2;
    if (__r5942 != null && !(__r5942 == Boolean.FALSE)) {
     Object __r5943 = null;
     {
      Object match3 = temp__4117__auto__2;
      __r5943 = ((IFn)const__2.getRawRoot()).invoke(match3);
     }
     __r5941 = __r5943;
    } else {
     __r5941 = null;
    }
    __r5940 = __r5941;
   }
   Object or__3968__auto__4 = __r5940;
   Object __r5945 = or__3968__auto__4;
   if (__r5945 != null && !(__r5945 == Boolean.FALSE)) {
    return or__3968__auto__4;
   } else {
    return name1;
   }
  }
 }
}

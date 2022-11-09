package model;


import tutorial.Mail;

import java.util.ArrayList;
import java.util.List;

public class MailModel {

    public static final List<Mail> today = new ArrayList<Mail>();
    public static final List<Mail> yesterday = new ArrayList<Mail>();
    public static final List<Mail> lastweek = new ArrayList<Mail>();
    public static final List<List<Mail>> allData = new ArrayList<List<Mail>>();
    public static final List<String> headers = new ArrayList<String>();

    //initial demo data
    static {
        today.add(new Mail(1, "[zk1 - Help] RE: Bandbox Autocomplete Problem", "2012/11/18 10:16:27", 16));
        today.add(new Mail(2, "[zk1 - Help] RE: Bandbox Autocomplete Problem", "2012/11/18 10:14:27", 18));
        today.add(new Mail(3, "[zk1 - Help] RE: Databinding with radiogroups", "2012/11/18 09:47:27", 12));
        today.add(new Mail(4, "[zk1 - Help] RE: It's not possible to navigate a listbox' ite", "2012/11/18 09:35:27", 12));
        today.add(new Mail(5, "[zk1 - Help] RE: ZK problem in dynamic menu", "2012/11/18 08:37:27", 12));
        today.add(new Mail(6, "[zk1 - Help] RE: FileUpload", "2012/11/18 08:27:57", 14));
        today.add(new Mail(7, "[zk1 - Help] RE: Datebox format", "2012/11/18 06:27:31", 11));
        today.add(new Mail(8, "[zk1 - Help] RE: Datebox format", "2012/11/18 06:17:22", 12));
        today.add(new Mail(9, "[zk1 - Help] FileUpload", "2012/11/18 05:07:25", 11));
        today.add(new Mail(10, "[zk1 - Help] FileUpload", "2012/11/18 05:07:25", 11));
        today.add(new Mail(11, "[zk1 - Help] FileUpload", "2012/11/18 05:07:25", 11));
        today.add(new Mail(12, "[zk1 - General] RE: Opening more than one new	browser window", "2012/11/18 04:44:17", 12));
        today.add(new Mail(13, "[zk1 - General] RE: Opening more than one new	browser window", "2012/11/18 04:44:17", 12));
        today.add(new Mail(14, "[zk1 - General] RE: Opening more than one new	browser window", "2012/11/18 04:44:17", 12));
        today.add(new Mail(15, "[zk1 - General] RE: Opening more than one new	browser window", "2012/11/18 04:44:17", 12));
        today.add(new Mail(16, "[zk1 - Help] RE: SelectedItemConverter Question", "2012/11/18 04:31:12", 14));
        today.add(new Mail(17, "Where is the demo?", "2012/11/18 04:31:12", 14));
        today.add(new Mail(18, "Where is your product page?", "2012/11/18 04:31:12", 14));
        today.add(new Mail(19, "ZK information required!", "2012/11/18 04:31:12", 14));

        yesterday.add(new Mail(1, "[zk1 - General] RE: Opening more than one new browser window", "2012/11/17 19:44:17", 39));
        yesterday.add(new Mail(2, "[zk1 - General] RE: Opening more than one new browser window", "2012/11/17 19:42:17", 35));
        yesterday.add(new Mail(3, "[zk1 - General] RE: Opening more than one new browser window", "2012/11/17 19:40:17", 26));
        yesterday.add(new Mail(4, "[zk1 - General] RE: Opening more than one new browser window", "2012/11/17 18:14:17", 27));
        yesterday.add(new Mail(5, "[zk1 - General] RE: Opening more than one new browser window", "2012/11/17 17:05:17", 18));
        yesterday.add(new Mail(6, "[zk1 - General] RE: Opening more than one new browser window", "2012/11/17 16:44:17", 19));
        yesterday.add(new Mail(7, "[zk1 - Help] RE: SelectedItemConverter Question", "2012/11/17 13:31:12", 14));
        yesterday.add(new Mail(8, "[zk1 - Help] RE: SelectedItemConverter Question", "2012/11/17 13:31:12", 14));
        yesterday.add(new Mail(9, "[zk1 - Help] RE: SelectedItemConverter Question", "2012/11/17 13:31:12", 14));
        yesterday.add(new Mail(10, "[zk1 - Help] RE: SelectedItemConverter Question", "2012/11/17 13:31:12", 14));
        yesterday.add(new Mail(11, "[zk1 - Help] RE: Times_Series Chart help", "2012/11/17 13:26:37", 14));
        yesterday.add(new Mail(12, "[zk1 - Help] RE: Times_Series Chart help", "2012/11/17 13:26:37", 14));
        yesterday.add(new Mail(13, "[zk1 - Help] RE: Times_Series Chart help", "2012/11/17 13:26:37", 14));
        yesterday.add(new Mail(14, "[zk1 - Help] RE: Times_Series Chart help", "2012/11/17 10:41:33", 14));
        yesterday.add(new Mail(15, "[zk1 - Help] RE: SelectedItemConverter Question", "2012/11/17 10:14:27", 14));
        yesterday.add(new Mail(16, "[zk1 - Help] RE: Bandbox Autocomplete Problem", "2012/11/18 10:16:27", 16));
        yesterday.add(new Mail(17, "[zk1 - Help] RE: Bandbox Autocomplete Problem", "2012/11/18 10:14:27", 18));
        yesterday.add(new Mail(18, "[zk1 - Help] RE: Databinding with radiogroups", "2012/11/18 09:47:27", 12));
        yesterday.add(new Mail(19, "[zk1 - Help] RE: It's not possible to navigate a listbox' ite", "2012/11/18 09:35:27", 12));

        lastweek.add(new Mail(1, "[zk1 - Help] RE: SelectedItemConverter Question", "2012/11/15 04:31:12", 14));
        lastweek.add(new Mail(2, "[zk1 - Help] RE: SelectedItemConverter Question", "2012/11/15 04:31:12", 14));
        lastweek.add(new Mail(3, "[zk1 - Help] RE: SelectedItemConverter Question", "2012/11/15 04:31:12", 14));
        lastweek.add(new Mail(4, "[zk1 - Help] RE: Times_Series Chart help", "2012/11/15 03:26:37", 14));
        lastweek.add(new Mail(5, "[zk1 - Help] RE: Times_Series Chart help", "2012/11/15 03:26:37", 14));
        lastweek.add(new Mail(6, "[zk1 - Help] RE: Times_Series Chart help", "2012/11/15 03:26:37", 14));
        lastweek.add(new Mail(7, "[zk1 - Help] RE: Times_Series Chart help", "2012/11/14 12:41:33", 14));
        lastweek.add(new Mail(8, "[zk1 - Help] RE: Times_Series Chart help", "2012/11/14 02:41:33", 14));
        lastweek.add(new Mail(9, "[zk1 - Help] RE: Times_Series Chart help", "2012/11/14 02:41:33", 14));
        lastweek.add(new Mail(10, "[zk1 - Help] RE: Times_Series Chart help", "2012/11/14 02:41:33", 14));
        lastweek.add(new Mail(11, "[zk1 - Help] RE: SelectedItemConverter Question", "2012/11/13 02:14:27", 14));
        lastweek.add(new Mail(12, "[zk1 - Help] RE: SelectedItemConverter Question", "2012/11/13 02:14:27", 14));
        lastweek.add(new Mail(13, "[zk1 - Help] RE: SelectedItemConverter Question", "2012/11/13 02:14:27", 14));
        lastweek.add(new Mail(14, "[zk1 - Help] RE: SelectedItemConverter Question", "2012/11/13 02:14:27", 14));
        lastweek.add(new Mail(15, "[zk1 - Help] RE: Bandbox Autocomplete Problem", "2012/11/18 10:16:27", 16));
        lastweek.add(new Mail(16, "[zk1 - Help] RE: Bandbox Autocomplete Problem", "2012/11/18 10:14:27", 18));
        lastweek.add(new Mail(17, "[zk1 - Help] RE: Databinding with radiogroups", "2012/11/18 09:47:27", 12));
        lastweek.add(new Mail(18, "[zk1 - Help] RE: It's not possible to navigate a listbox' ite", "2012/11/18 09:35:27", 12));

        allData.add(today);
        allData.add(yesterday);
        allData.add(lastweek);

        headers.add("Date: Today");
        headers.add("Date: Yesterday");
        headers.add("Date: Last Week");
    }

}
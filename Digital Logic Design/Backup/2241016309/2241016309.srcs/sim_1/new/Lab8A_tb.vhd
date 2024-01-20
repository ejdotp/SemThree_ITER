----------------------------------------------------------------------------------
-- Company: 
-- Engineer: 
-- 
-- Create Date: 01/06/2024 01:24:08 PM
-- Design Name: 
-- Module Name: Lab8A_tb - Dataflow
-- Project Name: 
-- Target Devices: 
-- Tool Versions: 
-- Description: 
-- 
-- Dependencies: 
-- 
-- Revision:
-- Revision 0.01 - File Created
-- Additional Comments:
-- 
----------------------------------------------------------------------------------


library IEEE;
use IEEE.STD_LOGIC_1164.ALL;

-- Uncomment the following library declaration if using
-- arithmetic functions with Signed or Unsigned values
--use IEEE.NUMERIC_STD.ALL;

-- Uncomment the following library declaration if instantiating
-- any Xilinx leaf cells in this code.
--library UNISIM;
--use UNISIM.VComponents.all;

entity Lab8A_tb is
--  Port ( );
end Lab8A_tb;
-- E. Jagadeeswar Patro - 2241016309
architecture Dataflow of Lab8A_tb is
component Lab8A
port(A, B, C, D: in std_logic;
     F: out std_logic);
end component;
signal A, B, C, D: std_logic;
signal F: std_logic;
begin
uut: Lab8A port map(A=>A, B=>B, C=>C, D=>D, F=>F);
stimulus: process
begin
A<='0';B<='0';C<='0';D<='0'; wait for 10ns;
A<='0';B<='0';C<='0';D<='1'; wait for 10ns;
A<='0';B<='0';C<='1';D<='0'; wait for 10ns;
A<='0';B<='0';C<='1';D<='1'; wait for 10ns;
A<='0';B<='1';C<='0';D<='0'; wait for 10ns;
A<='0';B<='1';C<='0';D<='1'; wait for 10ns;
A<='0';B<='1';C<='1';D<='0'; wait for 10ns;
A<='0';B<='1';C<='1';D<='1'; wait for 10ns;
A<='1';B<='0';C<='0';D<='0'; wait for 10ns;
A<='1';B<='0';C<='0';D<='1'; wait for 10ns;
A<='1';B<='0';C<='1';D<='0'; wait for 10ns;
A<='1';B<='0';C<='1';D<='1'; wait for 10ns;
A<='1';B<='1';C<='0';D<='0'; wait for 10ns;
A<='1';B<='1';C<='0';D<='1'; wait for 10ns;
A<='1';B<='1';C<='1';D<='0'; wait for 10ns;
A<='1';B<='1';C<='1';D<='1'; wait for 10ns;
end process;
end dataflow;
